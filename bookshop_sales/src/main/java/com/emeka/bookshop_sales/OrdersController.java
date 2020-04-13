package com.emeka.bookshop_sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class OrdersController  {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrdersRepository ordersRepository;

    @PostMapping("/orders")
    public String sellBooks(@RequestBody OrderRequest orderRequest) {

        String bookName = restTemplate.getForObject("http://bookshop-inventory-service/books/" + orderRequest.getBookId(), String.class);
        String staffName = restTemplate.getForObject("http://staff-management-service/staff/" + orderRequest.getStaffId(), String.class);

        Orders order = new Orders();
        order.setBookName(bookName);
        order.setStaffName(staffName);
        order.setQuantity(orderRequest.getQuantity());

        ordersRepository.save(order);
        return "Order submitted";
    }

    @GetMapping("/orders")
    public List<Orders> getOrders() {
        return ordersRepository.findAll();
    }
}
