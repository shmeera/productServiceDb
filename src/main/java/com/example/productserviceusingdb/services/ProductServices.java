package com.example.productserviceusingdb.services;

import com.example.productserviceusingdb.dtos.GenericProductDto;
import com.example.productserviceusingdb.exceptions.NotFoundException;
import com.example.productserviceusingdb.interfaces.IProduct;
import com.example.productserviceusingdb.models.Product;
import com.example.productserviceusingdb.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServices implements IProduct {
    private final ProductRepository productRepository;

    public ProductServices(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product GetProductById(Long id) throws NotFoundException {
        Product product = productRepository.findById(id).orElse(null);
        if(product==null)
            throw new NotFoundException(" Testing Product with id: " + id + " not found enter correct id");
        else
             return product;

    }

    @Override
    public Product CreateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> GetAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product updateProduct(Long id, Product productDetails) throws NotFoundException {
        Product product = productRepository.findById(id)
                .orElseThrow(()-> new NotFoundException("Product not found for id "+id));

        product.setTitle(productDetails.getTitle());
        product.setCategory(productDetails.getCategory());
        product.setImage(productDetails.getImage());
        product.setDescription(productDetails.getDescription());
        product.setPrice(productDetails.getPrice());

        return  productRepository.save(product);
        //return null;
    }

    @Override
    public void deleteProduct(Long id) throws NotFoundException {
       Product product = productRepository.findById(id)
               .orElseThrow(()-> new NotFoundException("product id not found "+id));

       productRepository.delete(product);
    }

//    private GenericProductDto ConvertProductToDto(Product product){
//        GenericProductDto genericProductDto = new GenericProductDto();
//        genericProductDto.setId(product.getId());
//        genericProductDto.setTitle(product.getTitle());
//        genericProductDto.setPrice(product.getPrice());
//        genericProductDto.setDescription(product.getDescription());
//        genericProductDto.setCategory(product.getCategory());
//        genericProductDto.setImage(product.getImage());
//
//        return genericProductDto;
//    }
}
