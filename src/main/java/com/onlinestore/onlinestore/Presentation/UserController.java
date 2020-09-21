package com.onlinestore.onlinestore.Presentation;

import com.onlinestore.onlinestore.Core.Service.UserService;
import com.onlinestore.onlinestore.Presentation.DTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/sign-up")
    public String signUp(@RequestBody UserDTO userDTO) {
        userService.signUp(userDTO);
        return "Added new user: " + userDTO.getUsername();
    }


    //For testing only
    @GetMapping(value = "/display")
    public ResponseEntity reachSecureEndpoint() {
        return new ResponseEntity("If your are reading this you reached a secure endpoint", HttpStatus.OK);
    }
}
