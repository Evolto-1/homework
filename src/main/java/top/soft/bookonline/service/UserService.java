package top.soft.bookonline.service;

import top.soft.bookonline.entity.User;

public interface UserService {
    User signIn(String username, String password);

    User signUp(String account, String password) ;
}