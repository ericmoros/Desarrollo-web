package com.losenlaces.demo.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/**
 * User
 */
@Data
@Entity
public class User {
    @Id
    private Integer UserId;
    private String Username;
    private String Email;

    private List<ChickenBreast> ChickenBreasts;
}