/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.managerment_library.controller;

import com.managerment_library.entity.CatgoryEntity;
import com.managerment_library.repository.CatgoryDAO;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class CatgoryController {

    private final CatgoryDAO catgoryDAO = new CatgoryDAO();

    public Map<Long, String> getMapCatgory() {
        Map<Long, String> mapCatgory = new HashMap<>();
        List<CatgoryEntity> catgoryEntitys = catgoryDAO.getAll();
        catgoryEntitys.forEach((catgoryEntity) -> {
            mapCatgory.put(catgoryEntity.getId(), catgoryEntity.getCatgory());
        });
        return mapCatgory;
    }
}
