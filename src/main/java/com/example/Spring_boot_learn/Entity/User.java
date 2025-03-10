package com.example.Spring_boot_learn.Entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.Length;
import org.hibernate.annotations.GenericGenerator;
@Data
@EqualsAndHashCode(callSuper = true)
@Entity(name = "m_user") //สร้างtable
public class User extends BaseEntity {
    @Column(nullable = false,unique = true,length = 60)
    private  String email;

    @Column(nullable = false,length = 120)
    private String password;

    @Column(nullable = false,length = 120)
    private  String name ;


}
