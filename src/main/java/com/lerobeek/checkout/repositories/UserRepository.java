package com.lerobeek.checkout.repositories;

import com.lerobeek.checkout.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
