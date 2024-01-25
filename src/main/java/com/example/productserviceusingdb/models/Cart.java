package com.example.productserviceusingdb.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Cart extends BaseModel{
    @ManyToMany
    @JoinTable(name="testProduct_cart",joinColumns = @JoinColumn(name = "cart_id"),
            inverseJoinColumns = @JoinColumn(name="testProduct_id"))
    @JsonManagedReference
    List<TestProduct> testProducts;
}
