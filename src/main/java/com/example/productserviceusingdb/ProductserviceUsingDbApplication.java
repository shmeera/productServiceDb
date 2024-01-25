package com.example.productserviceusingdb;

import com.example.productserviceusingdb.models.*;
import com.example.productserviceusingdb.repositories.*;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    private CartRepository cartRepository;
    private TestProductRepository testProductRepository;
    private ObjectMapper objectMapper;
    public ProductserviceUsingDbApplication(ProductRepository productRepository, CategoryRepository categoryRepository, OrderRepository orderRepository, CartRepository cartRepository, TestProductRepository testProductRepository, ObjectMapper objectMapper){
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
        this.orderRepository = orderRepository;
        this.cartRepository = cartRepository;
        this.testProductRepository = testProductRepository;
        this.objectMapper = objectMapper;
    }
    public static void main(String[] args) {
        SpringApplication.run(ProductserviceUsingDbApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//       // productRepository.deleteById(3L);
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
//        String jsonData = objectMapper.writeValueAsString(order);
//        System.out.println(jsonData);
//        orderRepository.save(order);

        //create object of Cart to get cart id , for test product
//
//        Cart cart = new Cart();
//        List<Cart> lstCart = new ArrayList<>();
//
//        Cart savedCart = cartRepository.save(cart);
//        lstCart.add(savedCart);
//
//        String jsonDataCart = objectMapper.writeValueAsString(lstCart);
//        System.out.println(jsonDataCart);
//
//        List<TestProduct> testProductList = new ArrayList<>();
//        TestProduct testProduct = new TestProduct();
//        testProduct.setTitle("Test product 1");
//        testProduct.setDescription("Product fine 1");
//        testProduct.setCarts( lstCart); //from above
//
//       TestProduct savedTestProduct =  testProductRepository.save(testProduct);
//
//
//        //create Cart to save
//        //create arraylist of testProduct to save
//        List<TestProduct> testProductList1 = new ArrayList<>();
//        testProductList1.add(savedTestProduct);
//
//        //Cart cart1 = new Cart();
//        cart.setTestProducts(testProductList1);
//        cartRepository.save(cart);
//
//        String jsonDataTestProduct = objectMapper.writeValueAsString(testProductList1);
//        System.out.println(jsonDataTestProduct);
//        //order.setId(1L);

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

