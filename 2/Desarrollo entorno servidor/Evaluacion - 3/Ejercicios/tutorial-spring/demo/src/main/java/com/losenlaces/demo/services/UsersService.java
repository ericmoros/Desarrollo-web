package com.losenlaces.demo.services;

import java.util.List;

import com.losenlaces.demo.models.User;
import com.losenlaces.demo.repositories.UsersRepository;

import org.springframework.stereotype.Service;

/**
 * UserService
 */
@Service
public class UsersService {
    private UsersRepository UsersRepository;

    public UsersService(UsersRepository UsersRepository) {
        this.UsersRepository = UsersRepository;
    }

    public List<User> GetAll() {
        return UsersRepository.findAll();
    }

    public void RemoveAll() {
        UsersRepository.deleteAll();
    }

    public List<User> SaveAll(List<User> Users) {
        return UsersRepository.saveOrUpdateAll(Users);
    }

    public User Get(Integer UserId) {
        return UsersRepository.findByUserId(UserId);
    }
}