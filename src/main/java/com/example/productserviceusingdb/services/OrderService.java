package com.example.productserviceusingdb.services;

import com.example.productserviceusingdb.models.Category;
import com.example.productserviceusingdb.models.Orders;
import com.example.productserviceusingdb.models.Price;
import com.example.productserviceusingdb.models.Product;
import com.example.productserviceusingdb.repositories.CategoryRepository;
import com.example.productserviceusingdb.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final CategoryRepository categoryRepository;
    public OrderService(OrderRepository orderRepository, CategoryRepository categoryRepository) {
        this.orderRepository = orderRepository;
        this.categoryRepository = categoryRepository;
    }
    public Orders GetOrderById(Long id){
        return  orderRepository.findById(id).orElse(null);
    }
    public List<Orders> GetAllOrders(){
        return orderRepository.findAll();
    }
    public Orders CreateOrder(Orders order){
        for(Product p: order.getProducts()){
            Category c = categoryRepository.findById(p.getId()).orElse(null);

            if(c !=null){
                p.setCategory(c);
            }
        }
        return orderRepository.save(order);
    }
}
