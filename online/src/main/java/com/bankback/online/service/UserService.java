package com.bankback.online.service;

import com.bankback.online.entity.User;


public interface UserService {
User saveUser(User userdata);
User getUserById(long id);
User checkuser(String username,String pass);
}

