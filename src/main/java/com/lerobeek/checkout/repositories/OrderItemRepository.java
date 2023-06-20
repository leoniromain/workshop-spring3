package com.lerobeek.checkout.repositories;

import com.lerobeek.checkout.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
