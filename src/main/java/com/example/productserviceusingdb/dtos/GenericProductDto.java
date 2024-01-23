package com.example.productserviceusingdb.dtos;

import com.example.productserviceusingdb.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericProductDto {
    private Long id;
    private String title;
    private String description;
    private String image;
    private Category category;
    private double price;
}