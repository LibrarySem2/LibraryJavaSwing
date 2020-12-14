/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.managerment_library.controller;

import com.managerment_library.repository.UserDAO;


/**
 *
 * @author Admin
 */
public class UserController {
    
    private final UserDAO userDAO = new UserDAO();
    
    public String isExistUser(String userName, String password) {
        return userDAO.isExistUser(userName, password);
    } 
    
}
