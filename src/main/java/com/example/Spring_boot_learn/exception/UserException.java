package com.example.Spring_boot_learn.exception;

public class UserException extends BaseException{

    public UserException(String code) {
        super("User." + code);
    }

    public static UserException requestNull(){
        return new UserException("Register.request.null");
    }
    public static UserException emailNull(){
        return new UserException("Register.email.null");
    }


    public static UserException CreatedemailNull(){
        return new UserException("created.email.null");
    }
    public static UserException CreatedpassNull(){
        return new UserException("created.pass.null");
    }

    public static UserException CreatednameNull(){
        return new UserException("created.name.null");
    }


    public static UserException CreatedDuplicateEmail(){
        return new UserException("Duplicate.mail");
    }




}
