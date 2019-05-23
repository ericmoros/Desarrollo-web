package com.losenlaces.demo.services;

import java.util.List;

import com.losenlaces.demo.models.ChickenBreast;
import com.losenlaces.demo.repositories.ChickenBreastsRepository;

import org.springframework.stereotype.Service;

/**
 * ChickenBreasts
 */
@Service
public class ChickenBreastsService {
    private ChickenBreastsRepository ChickenBreastsRepository;

    public ChickenBreastsService(ChickenBreastsRepository chickenBreastsRepository) {
        this.ChickenBreastsRepository = chickenBreastsRepository;
    }

    public List<ChickenBreast> GetAll() {
        return ChickenBreastsRepository.findAll();
    }

    public void RemoveAll() {
        ChickenBreastsRepository.deleteAll();
    }   

    public List<ChickenBreast> SaveAll(List<ChickenBreast> chickenBreasts) {
        return ChickenBreastsRepository.saveOrUpdateAll(chickenBreasts);
    }

    public ChickenBreast Get(Integer chickenBreastId) {
        return ChickenBreastsRepository.findByChickenBreastId(chickenBreastId);
    }
}