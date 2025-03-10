package com.example.Spring_boot_learn.exception;

public class ProductException extends BaseException {
   public ProductException(String code){
       super("Product." + code);
   }
    public static ProductException notFound(){
        return new ProductException("Not.foundID");
    }
}
