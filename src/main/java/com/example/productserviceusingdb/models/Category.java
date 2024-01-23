package com.example.productserviceusingdb.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Category extends BaseModel {
    private String name;

    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
    List<Product> products;
}
/*
in Category i want to get product
the moment many comes - list
to tell spring that List<Product> products; and     private Category category;
are same we use mappedBy use same variable name as in Product subclass
 */