package com.emeka.bookshop_sales.services;

import com.emeka.bookshop_sales.OrderRequest;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

@Service
public class BookService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(
            fallbackMethod = "getFallbackBookName",
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000"),
                    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value="6"),
                    @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value="50"),
                    @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value="6000")
            }
    )
    public String getBookName(@RequestBody OrderRequest orderRequest) {
        return restTemplate.getForObject("http://bookshop-inventory-service/books/" + orderRequest.getBookId(), String.class);
    }

    public String getFallbackBookName(@RequestBody OrderRequest orderRequest) {
        return "No book name";
    }
}
