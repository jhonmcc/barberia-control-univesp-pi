package com.univesp.barbearia.pi.controller;

import com.univesp.barbearia.pi.dto.UserDTO;
import com.univesp.barbearia.pi.entity.UserEntity;
import com.univesp.barbearia.pi.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping(path = "/info")
    public UserEntity getInfoUser(@RequestParam Long id){
        try{
            return userService.getInfoUserID(id);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return new UserEntity();
        }
    }

    @PostMapping(path = "/register")
    public Boolean registerUser(@RequestBody UserDTO user){
        try{
            userService.registerUser(user);
            return true;

        } catch (Exception e){
            logger.error(e.getMessage(), e);
            return false;
        }
    }
}
