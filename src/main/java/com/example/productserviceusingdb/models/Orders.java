package com.example.productserviceusingdb.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name="orders")
public class Orders extends BaseModel {
    @ManyToMany
    @JoinTable(name="product_orders",joinColumns = @JoinColumn(name = "order_id"),
    inverseJoinColumns = @JoinColumn(name="product_id"))
    @JsonManagedReference
    private List<Product> products;
}
