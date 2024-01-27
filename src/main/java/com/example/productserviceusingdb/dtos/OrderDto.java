package com.example.productserviceusingdb.dtos;

import com.example.productserviceusingdb.models.BaseModel;
import com.example.productserviceusingdb.models.Product;
import jakarta.persistence.criteria.Order;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class OrderDto  {
    private List<Long> productId;
}
