package com.italloramon.spring_shop.repositories;

import com.italloramon.spring_shop.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
