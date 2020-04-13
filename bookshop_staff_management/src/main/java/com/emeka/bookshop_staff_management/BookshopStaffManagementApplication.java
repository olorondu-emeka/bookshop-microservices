package com.emeka.bookshop_staff_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BookshopStaffManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookshopStaffManagementApplication.class, args);
    }

}
