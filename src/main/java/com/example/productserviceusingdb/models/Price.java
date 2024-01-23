package com.example.productserviceusingdb.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Price extends BaseModel {
    private String currency;
    private double price;
}
/*
@AllArgsConstructor:
This annotation generates an all-arguments constructor for a class. It includes parameters for all fields in the class.

NoArgsConstructor:
This annotation generates a no-arguments (default) constructor for a class.
 */