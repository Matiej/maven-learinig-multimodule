package com.emat.controllers;

import com.emat.entities.user.UserEntity;
import com.emat.webapi.domain.UserCommand;

public class UserFakeController {

    UserEntity saveUser(UserCommand command) {
        return new UserEntity();
    }
}
