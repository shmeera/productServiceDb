package com.example.productserviceusingdb.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Product extends BaseModel{
    private String title;
    private String description;
    private String image;
   // private String category;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="category_id")
    private Category category;

    @OneToOne(cascade = {CascadeType.REMOVE, CascadeType.PERSIST})
    private Price price;

    @ManyToMany(mappedBy = "products", fetch =FetchType.EAGER)
    @JsonBackReference
    private List<Orders> orders;


}
/*
remember
from product to category - M:1
category to product - 1:M

//lets create whats app group
group crated by 1 person
group has users
List<user> participants;
admin
List<user> admin
relationship can be different depending upon use case

you need to have some kind of join
 */