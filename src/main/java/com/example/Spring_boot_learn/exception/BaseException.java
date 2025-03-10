package com.example.Spring_boot_learn.exception;

public abstract class BaseException extends Exception{
    public BaseException(String code){
        super(code);
    }

}
