package com.ToDoList.core.usecases;

import com.ToDoList.core.entities.User;

public class createUserImpl implements createUserCase{
    @Override
    public User execute(User user) {
        return user;
    }
}
