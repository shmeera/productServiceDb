package com.example.productserviceusingdb;

import com.example.productserviceusingdb.models.Category;
import com.example.productserviceusingdb.models.Orders;
import com.example.productserviceusingdb.models.Price;
import com.example.productserviceusingdb.models.Product;
import com.example.productserviceusingdb.repositories.CategoryRepository;
import com.example.productserviceusingdb.repositories.OrderRepository;
import com.example.productserviceusingdb.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ProductserviceUsingDbApplication implements CommandLineRunner {
    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;
    private OrderRepository orderRepository;
    public ProductserviceUsingDbApplication(ProductRepository productRepository, CategoryRepository categoryRepository, OrderRepository orderRepository){
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
        this.orderRepository = orderRepository;
    }
    public static void main(String[] args) {
        SpringApplication.run(ProductserviceUsingDbApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//        productRepository.deleteById(3L);
//        Category category = new Category();
//        category.setName("electronics");
//
//        Category savedCategory = categoryRepository.save(category);
//
//        Price price = new Price();
//        price.setPrice(100L);
//        price.setCurrency("INR");
//
//        List<Product> productList = new ArrayList<>();
//
//        Product product = new Product();
//        product.setTitle("Samsung");
//        product.setDescription("best phone");
//        product.setPrice(price);
//        product.setImage("image url");
//        product.setCategory(savedCategory);
//        productRepository.save(product);
//
//        productList.add(product);
//
//        Orders order  = new Orders();
//
//        order.setProducts(productList);
//        orderRepository.save(order);
//        order.setId(1L);

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

