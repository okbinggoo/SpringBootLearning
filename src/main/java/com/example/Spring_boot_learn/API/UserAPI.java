package com.example.Spring_boot_learn.API;

import com.example.Spring_boot_learn.BusinessLogic.UserBusiness;
import com.example.Spring_boot_learn.Entity.User;
import com.example.Spring_boot_learn.Model.RegisterReq;
import com.example.Spring_boot_learn.Model.TestResponse;
import com.example.Spring_boot_learn.exception.BaseException;
import com.example.Spring_boot_learn.exception.FileException;
import com.example.Spring_boot_learn.exception.UserException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/user") //ถ้าเรียกทุห API จะเรียกโมดูลทั้งหมด
public class UserAPI {

//    @Autowired
//    private TestBusiness business;

    private final UserBusiness business ;

    public UserAPI(UserBusiness business) {
        this.business = business;
    }

    @GetMapping
    public TestResponse test(){
        TestResponse res = new TestResponse();
        res.setFood("KFC");
        res.setName("Siri");

        return res;
    }

    @GetMapping
    @RequestMapping("/test2")
    public TestResponse test2(){
        TestResponse res = new TestResponse();
        res.setFood("KFCEIEI");
        res.setName("SiriEIEI");

        return res;
    }


    @PostMapping
    @RequestMapping("/register")
    public ResponseEntity<User> register(@RequestBody RegisterReq req) throws BaseException {
        User resString = business.register(req);
        return ResponseEntity.ok(resString);
    }

//    @PostMapping
//    @RequestMapping("/register")
//    public ResponseEntity<String> register(@RequestBody RegisterReq req) throws UserException {
//        String resString = business.register(req);
//        return ResponseEntity.ok(resString);
//    }

    @PostMapping
    public ResponseEntity<String> uploadProfilePic(@RequestPart MultipartFile file) throws FileException {
        String resp = business.uploadProfilePic(file);

        return ResponseEntity.ok(resp);
    }

}
