package com.losenlaces.demo.models;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/**
 * ChickenBreast
 */
@Data
@Entity
public class ChickenBreast {
    @Id
    private Integer ChickenBreastId;
    private String BreastName;
    private Integer Stock;
    private BigDecimal UnitPrice;

    private List<User> Users;
}