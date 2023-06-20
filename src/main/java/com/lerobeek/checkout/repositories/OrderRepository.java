package com.lerobeek.checkout.repositories;

import com.lerobeek.checkout.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
