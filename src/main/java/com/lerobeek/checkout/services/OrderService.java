package com.lerobeek.checkout.services;

import com.lerobeek.checkout.entities.Order;
import com.lerobeek.checkout.entities.User;
import com.lerobeek.checkout.repositories.OrderRepository;
import com.lerobeek.checkout.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findById(Long id){
       Optional<Order> order = orderRepository.findById(id);
       return order.get();
    }
}
