package com.losenlaces.demo.repositories;

import java.util.List;

import com.losenlaces.demo.models.ChickenBreast;

import org.springframework.data.repository.CrudRepository;

/**
 * ChickenBreastsRepository
 */
public interface ChickenBreastsRepository extends CrudRepository<ChickenBreast, Integer> {
    List<ChickenBreast> findAll();
    List<ChickenBreast> saveOrUpdateAll(List<ChickenBreast> chickenBreasts);
    void deleteAll();
    ChickenBreast findByChickenBreastId(Integer ChickenBreastId);
    ChickenBreast saveOrUpdate(ChickenBreast ChickenBreast);
    void delete(Integer ChickenBreastId);
}