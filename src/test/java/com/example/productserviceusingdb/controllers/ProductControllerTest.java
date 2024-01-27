package com.example.productserviceusingdb.controllers;

import com.example.productserviceusingdb.exceptions.NotFoundException;
import com.example.productserviceusingdb.models.Category;
import com.example.productserviceusingdb.models.Price;
import com.example.productserviceusingdb.models.Product;
import com.example.productserviceusingdb.services.ProductServices;
import org.hibernate.mapping.Any;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

public class ProductControllerTest {
    private ProductController productController;
    private ProductServices mockProductServices;
    public ProductControllerTest(){
         mockProductServices = Mockito.mock(ProductServices.class);
        productController = new ProductController(mockProductServices);
    }

    @Test
    public void GetProductByIdNotNullTest() throws NotFoundException{
        when(mockProductServices.GetProductById(any()))
                .thenReturn(GetProduct());

        productController =new ProductController(mockProductServices);
        Product response = productController.GetProductById(1L);

        Assertions.assertNotNull(response);
    }
    @Test
    public void GetProductByIdThrowsException() throws NotFoundException {
        when(mockProductServices.GetProductById(any()))
                .thenReturn(GetProductNotFoundException());

        Assertions.assertThrows(NotFoundException.class,
                ()->productController.GetProductById(1L));
    }
    private Product GetProduct(){
        Category category = new Category();
        category.setName("Electronic");

        Price price = new Price();
        price.setCurrency("USD");
        price.setPrice(100L);

        Product product = new Product();
        product.setTitle("TestProduct");
        product.setImage("http:abc.ll");
        product.setDescription("good product");
        product.setCategory(category);
        product.setPrice(price);

        return  product;

    }
    private Product GetProductNotFoundException()  {
        return null;
    }
}
