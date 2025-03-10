package com.example.Spring_boot_learn.Model;

import lombok.Data;

@Data
public class RegisterReq {
    private String name;
    private String password;

    private String mail;

}
