package com.emeka.bookshop_inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BookshopInventoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookshopInventoryApplication.class, args);
    }

}
