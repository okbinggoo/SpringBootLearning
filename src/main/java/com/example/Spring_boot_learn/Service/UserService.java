package com.example.Spring_boot_learn.Service;

import com.example.Spring_boot_learn.Entity.User;
import com.example.Spring_boot_learn.Repository.UserRepository;
import com.example.Spring_boot_learn.exception.BaseException;
import com.example.Spring_boot_learn.exception.UserException;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserService {
    private final UserRepository repository;

//    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository repository) {
        this.repository = repository;

    }


    public User created(String email, String password , String name) throws BaseException {

        if(Objects.isNull((email))){
            throw UserException.CreatedemailNull();
        }
        if(Objects.isNull((password))){
            throw UserException.CreatedpassNull();
        }
        if(Objects.isNull(name)){
            throw UserException.CreatednameNull();
        }

        if(repository.existsByEmail(email)){
            throw  UserException.CreatedDuplicateEmail();

        }
        User entity = new User();
        entity.setEmail(email);
        entity.setPassword(password);
        entity.setName(name);

        return repository.save(entity);
    }
}
