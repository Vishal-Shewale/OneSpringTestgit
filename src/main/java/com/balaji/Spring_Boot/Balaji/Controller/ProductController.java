package com.balaji.Spring_Boot.Balaji.Controller;

import com.balaji.Spring_Boot.Balaji.entity.Product;
import com.balaji.Spring_Boot.Balaji.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/productintro")
    public String getControll()
    {
        return "Hey vishal these process is runned succesfully";
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product)
    {
        return productService.createProduct(product);
    }


}
