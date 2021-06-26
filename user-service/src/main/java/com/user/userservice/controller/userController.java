package com.user.userservice.controller;

import com.user.userservice.entity.User;
import com.user.userservice.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long userId){
        //http://localhost:9051/contact/user/1

        User user = userService.getUser(userId);

        List contacts = restTemplate.getForObject("http://contact-service/contact/user/" + user.getUserId() ,List.class);

        user.setContacts(contacts);

        return user;
    }
}
