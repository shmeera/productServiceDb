package com.example.productserviceusingdb.controllers;

import com.example.productserviceusingdb.models.TestProduct;
import com.example.productserviceusingdb.services.TestProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testProducts")
public class TestProductController {
    private TestProductService testProductService;

    public TestProductController(TestProductService testProductService) {
        this.testProductService = testProductService;
    }
    @PostMapping
    public TestProduct CreateTestProduct(@RequestBody TestProduct testProduct){
        return  testProductService.CreateTestProduct(testProduct);
    }
}
