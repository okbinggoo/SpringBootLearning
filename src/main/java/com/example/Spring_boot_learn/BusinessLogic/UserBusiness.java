package com.example.Spring_boot_learn.BusinessLogic;

import com.example.Spring_boot_learn.Entity.User;
import com.example.Spring_boot_learn.Model.RegisterReq;
import com.example.Spring_boot_learn.Service.UserService;
import com.example.Spring_boot_learn.exception.BaseException;
import com.example.Spring_boot_learn.exception.FileException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UserBusiness {

    private final UserService userService;

    public UserBusiness(UserService userService) {
        this.userService = userService;
    }


    public User register(RegisterReq req) throws BaseException {
        User user = userService.created(req.getMail(), req.getPassword(), req.getName());
        // TODO: mapper

        return user;
    }
//    public String register(RegisterReq req) throws UserException {
//        if (req == null) {
//            throw UserException.requestNull();
//        }
//        if (Objects.isNull(req.getMail())) {
//            throw UserException.emailNull();
//        }
//        return "";
//    }
    public String uploadProfilePic(MultipartFile file) throws FileException {
        if(file == null){
            throw FileException.fileNull();
        }
        if(file.getSize() > 104856*2){
            throw FileException.fileMaxsize();
        }
       return "";
    }

}
