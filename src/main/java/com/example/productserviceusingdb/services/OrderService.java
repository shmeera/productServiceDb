package com.example.productserviceusingdb.services;

import com.example.productserviceusingdb.dtos.OrderDto;
import com.example.productserviceusingdb.exceptions.NotFoundException;
import com.example.productserviceusingdb.models.Category;
import com.example.productserviceusingdb.models.Orders;
import com.example.productserviceusingdb.models.Price;
import com.example.productserviceusingdb.models.Product;
import com.example.productserviceusingdb.repositories.CategoryRepository;
import com.example.productserviceusingdb.repositories.OrderRepository;
import org.springframework.data.domain.jaxb.SpringDataJaxb;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final CategoryRepository categoryRepository;
    private final ProductServices productServices;
    public OrderService(OrderRepository orderRepository, CategoryRepository categoryRepository,ProductServices productServices) {
        this.orderRepository = orderRepository;
        this.categoryRepository = categoryRepository;
        this.productServices= productServices;
    }
    public Orders GetOrderById(Long id){
        return  orderRepository.findById(id).orElse(null);
    }
    public List<Orders> GetAllOrders(){

        return orderRepository.findAll();
    }
    public Orders CreateOrder(List<Long> productIds)throws NotFoundException{
        Orders orders = new Orders();
    //converted list of product ids to list<products>
        List<Product> products = productIds.stream()
                .map(productServices::getProduct)
                .toList();
       orders.setProducts(products);

        return orderRepository.save(orders);
    }
}
