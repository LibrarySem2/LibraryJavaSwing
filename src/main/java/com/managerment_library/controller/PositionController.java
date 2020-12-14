/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.managerment_library.controller;


import com.managerment_library.entity.PositionEntity;
import com.managerment_library.repository.PositionDAO;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class PositionController {
    
    private final PositionDAO positionDAO = new PositionDAO();
    
    public Map<Long, String> getPositionMap(){
        List<PositionEntity> positionEntitys = positionDAO.getALL();
        Map<Long, String> result = new HashMap<>();
        for (PositionEntity positionEntity : positionEntitys) {
            result.put(positionEntity.getId(), positionEntity.getPosision());
        }
        return result;
    }
}
