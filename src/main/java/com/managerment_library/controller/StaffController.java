/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.managerment_library.controller;

import com.managerment_library.entity.PositionEntity;
import com.managerment_library.entity.StaffEntity;
import com.managerment_library.repository.PositionDAO;
import com.managerment_library.repository.StaffDAO;
import java.util.List;

/**
 *
 * @author Admin
 */
public class StaffController {
    
    private final StaffDAO staffDAO = new StaffDAO();
    private final PositionDAO positionDAO = new PositionDAO();
    
    public List<StaffEntity> getAll() {
        List<StaffEntity> result = staffDAO.getAll();
        return result;
    }
    
    public StaffEntity saveStaff(StaffEntity staffEntity, Long positionId) {
        PositionEntity positionEntity = positionDAO.findById(positionId);
        staffEntity.setPosition(positionEntity);
        StaffEntity entity = staffDAO.saveStaff(staffEntity);
        return entity;
    }
    
    public StaffEntity updateStaff(StaffEntity staffEntity, long positionId) {
        PositionEntity positionEntity = positionDAO.findById(positionId);
        staffEntity.setPosition(positionEntity);
        StaffEntity entity = staffDAO.updateStaff(staffEntity);
        return entity;
    }
    
    public boolean delStaffById(Long[] staffIds) {
        boolean flag = false;
        for (Long staffId : staffIds) {
            if (staffDAO.delStaff(staffId) > 0) {
                flag = true;
            }
        }
        return flag;
    }
}
