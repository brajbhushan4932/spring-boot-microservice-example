package com.user.userservice.service;

import com.user.userservice.entity.User;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    //static user list
    List<User> list = List.of(
            new User(1L,"xyz"),
            new User(2L,"abc")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
