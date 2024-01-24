package com.example.productserviceusingdb.controllers;

import com.example.productserviceusingdb.models.Orders;
import com.example.productserviceusingdb.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
private OrderService orderService;

@Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @GetMapping("{id}")
    public Orders GetOrderById(@PathVariable("id") Long id){
        return orderService.GetOrderById(id);
    }
    @GetMapping
    public List<Orders> GetAllOrders(){
        return orderService.GetAllOrders();
    }
    @PostMapping
    public  Orders CreateOrder(@RequestBody Orders order){
    return orderService.CreateOrder(order);
    }
}
