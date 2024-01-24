package com.example.productserviceusingdb.repositories;

import com.example.productserviceusingdb.models.Orders;
import com.example.productserviceusingdb.services.OrderService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {
}
