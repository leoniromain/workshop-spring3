package com.lerobeek.checkout.repositories;

import com.lerobeek.checkout.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
