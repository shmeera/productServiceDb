package com.example.productserviceusingdb.controllers;

import com.example.productserviceusingdb.exceptions.NotFoundException;
import com.example.productserviceusingdb.models.Product;
import com.example.productserviceusingdb.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductServices productServices;

    @Autowired
    public ProductController(ProductServices productServices) {
        this.productServices = productServices;
    }
    @GetMapping("{id}")
    public Product GetProductById(@PathVariable("id") Long id) throws NotFoundException {
        Product product = productServices.GetProductById(id);
        if(product == null)
            throw new NotFoundException("product not found");
        return  productServices.GetProductById(id);
    }
    @GetMapping
    public List<Product> getAll(){
        return productServices.GetAllProducts();
    }
    @PostMapping()
    public Product create(@RequestBody Product product){
        return productServices.CreateProduct(product);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product productDetails) throws  NotFoundException
    {
        Product updateedProduct = productServices.updateProduct(id,productDetails);
        return  ResponseEntity.ok(updateedProduct);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) throws  NotFoundException{
        productServices.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }
}
