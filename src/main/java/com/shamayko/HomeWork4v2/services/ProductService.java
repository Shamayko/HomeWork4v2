package com.shamayko.HomeWork4v2.services;

import com.shamayko.HomeWork4v2.data.Product;
import org.springframework.stereotype.Service;
import com.shamayko.HomeWork4v2.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService {
 private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts (){return productRepository.getAllProducts(); }

    public void nullById (Long id) {productRepository.nullById(id); }

    public void changeQuantity(Long id, Integer delta) {
        Product product = productRepository.getProductById(id);
        product.setQuantity(product.getQuantity() + delta);
    }

    public Float totalCost() {return productRepository.sumByCart(); }
}
