package com.example.Spring_boot_learn.Repository;

import com.example.Spring_boot_learn.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

//User Class จาก Package ของ Entity , String ดูจาก Type ของ Primary key(ID)
public interface UserRepository extends CrudRepository<User, String> {

    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);
}
