package com.example.productserviceusingdb.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class TestProduct extends BaseModel{
    private String title;
    private String description;
    @ManyToMany(mappedBy = "testProducts", fetch = FetchType.EAGER)
    @JsonBackReference
    private List<Cart> carts;

}
