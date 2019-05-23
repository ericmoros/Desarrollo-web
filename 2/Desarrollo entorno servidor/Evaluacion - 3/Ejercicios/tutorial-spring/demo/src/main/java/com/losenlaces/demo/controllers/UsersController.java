package com.losenlaces.demo.controllers;

import java.util.List;

import com.losenlaces.demo.models.User;
import com.losenlaces.demo.services.UsersService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * UserController
 */
@Controller
public class UsersController {
    private UsersService UsersService;

    public UsersController(UsersService usersService) {
        this.UsersService = usersService;
    }

    @GetMapping({ "/", "" })
    public List<User> Get() {
        return this.UsersService.GetAll();
    }

}