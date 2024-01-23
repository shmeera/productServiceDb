package com.example.productserviceusingdb.interfaces;

import com.example.productserviceusingdb.dtos.GenericProductDto;
import com.example.productserviceusingdb.exceptions.NotFoundException;
import com.example.productserviceusingdb.models.Product;

import java.util.List;

public interface IProduct {
    public Product GetProductById(Long id) throws NotFoundException;
    public Product CreateProduct(Product product);
    public List<Product> GetAllProducts();
    public Product updateProduct(Long id, Product productDetails) throws NotFoundException;
    public void deleteProduct(Long id) throws NotFoundException;
}
