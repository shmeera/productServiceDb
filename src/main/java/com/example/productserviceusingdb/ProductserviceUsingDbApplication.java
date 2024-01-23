package com.example.productserviceusingdb;

import com.example.productserviceusingdb.models.Category;
import com.example.productserviceusingdb.models.Product;
import com.example.productserviceusingdb.repositories.CategoryRepository;
import com.example.productserviceusingdb.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class ProductserviceUsingDbApplication implements CommandLineRunner {
    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;
    public ProductserviceUsingDbApplication(ProductRepository productRepository,CategoryRepository categoryRepository){
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }
    public static void main(String[] args) {
        SpringApplication.run(ProductserviceUsingDbApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Category category = new Category();
//        category.setName("electronics");
//
//        Category savedCategory = categoryRepository.save(category);
//
//        Product product = new Product();
//        product.setTitle("iPhone");
//        product.setDescription("best phone");
//        product.setPrice(100.0);
//        product.setImage("image url");
//        product.setCategory(savedCategory);
//        productRepository.save(product);
//
//        //fetch Category
//        Optional<Category> categoryOptional = categoryRepository.findById(1L);
//        if(!categoryOptional.isEmpty()){
//            Category category1 = categoryOptional.get();
//            System.out.println(category1.getProducts());
//            System.out.println("DEBUG");
//        }
    }
}

