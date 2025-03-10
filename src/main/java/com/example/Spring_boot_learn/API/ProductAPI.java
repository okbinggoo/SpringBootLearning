package com.example.Spring_boot_learn.API;

import com.example.Spring_boot_learn.BusinessLogic.PRDBusiness;
import com.example.Spring_boot_learn.exception.BaseException;
import com.example.Spring_boot_learn.exception.ProductException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductAPI {

    private final PRDBusiness business;

    public ProductAPI(PRDBusiness business) {
        this.business = business;
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getPRDbyID(@PathVariable("id") String id) throws BaseException {
        String response = business.getPRDbyID(id);
        return ResponseEntity.ok(response);
    }

}
