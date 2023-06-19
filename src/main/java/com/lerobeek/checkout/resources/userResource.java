package com.lerobeek.checkout.resources;

import com.lerobeek.checkout.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class userResource {
        @GetMapping
        public ResponseEntity<User> findAll(){
            User u = new User(1L,"leoni","leoni@gmail.com", "123456789", "leoni123");
            return ResponseEntity.ok().body(u);
        }
}
