package com.example.Spring_boot_learn.exception;

public class FileException extends BaseException {
   public FileException(String code){
       super("File." + code);
   }
    public static FileException fileNull(){
        return new FileException("file.null");
    }

    public static FileException fileMaxsize(){
        return new FileException("file.oversize");
    }
}
