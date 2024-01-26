package com.example.productserviceusingdb.services;

import com.example.productserviceusingdb.models.TestProduct;
import com.example.productserviceusingdb.repositories.TestProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestProductService {
    private TestProductRepository testProductRepository;

    @Autowired
    public TestProductService(TestProductRepository testProductRepository) {
        this.testProductRepository = testProductRepository;
    }
    public TestProduct CreateTestProduct(TestProduct testProduct){
        return testProductRepository.save(testProduct);
    }
}
