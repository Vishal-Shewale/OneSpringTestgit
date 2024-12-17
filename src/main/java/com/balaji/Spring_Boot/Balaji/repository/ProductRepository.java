package com.balaji.Spring_Boot.Balaji.repository;

import com.balaji.Spring_Boot.Balaji.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
