package com.losenlaces.demo.repositories;

import java.util.List;

import com.losenlaces.demo.models.User;

import org.springframework.data.repository.CrudRepository;

/**
 * UserRepository
 */
public interface UsersRepository extends CrudRepository<User, Integer> {
    List<User> findAll();
    List<User> saveOrUpdateAll(List<User> Users);
    void deleteAll();
    User findByUserId(Integer UserId);
    User saveOrUpdate(User user);
    void delete(Integer UserId);
}