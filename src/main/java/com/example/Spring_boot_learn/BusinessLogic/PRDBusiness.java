package com.example.Spring_boot_learn.BusinessLogic;

import com.example.Spring_boot_learn.exception.BaseException;
import com.example.Spring_boot_learn.exception.ProductException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class PRDBusiness {
    public String getPRDbyID(String id) throws BaseException {
        if (Objects.equals("1234",id)){
            throw ProductException.notFound();
        }
        return id ;
    }

}
