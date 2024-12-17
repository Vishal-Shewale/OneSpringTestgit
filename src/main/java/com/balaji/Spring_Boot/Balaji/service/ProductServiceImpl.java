package com.balaji.Spring_Boot.Balaji.service;

import com.balaji.Spring_Boot.Balaji.entity.Product;
import com.balaji.Spring_Boot.Balaji.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
