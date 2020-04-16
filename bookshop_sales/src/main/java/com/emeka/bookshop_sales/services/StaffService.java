package com.emeka.bookshop_sales.services;

import com.emeka.bookshop_sales.OrderRequest;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

@Service
public class StaffService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getFallbackStaffName")
    public String getStaffName(@RequestBody OrderRequest orderRequest) {
        return restTemplate.getForObject("http://staff-management-service/staff/" + orderRequest.getStaffId(), String.class);
    }

    public String getFallbackStaffName(@RequestBody OrderRequest orderRequest) {
        return "No name";
    }
}
