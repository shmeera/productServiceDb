package com.example.productserviceusingdb.repositories;

import com.example.productserviceusingdb.models.TestProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestProductRepository extends JpaRepository<TestProduct,Long> {
}
