package com.jnshu.czm.service;

import com.jnshu.czm.model.Users;

public interface UsersService {

    public Users findUserById(int userId);

    public void insertUser(Users users);

    public Users findUserByName(String username);

}
