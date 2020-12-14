/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.managerment_library.controller;

import com.managerment_library.entity.BooksEntity;
import com.managerment_library.repository.BooksDAO;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class BooksController {

    private BooksDAO booksDAO = new BooksDAO();
    private CatgoryController catgoryController = new CatgoryController();

    public List<BooksEntity> getAll() {
        return booksDAO.getAll();
    }

    public List<BooksEntity> resultSearch(String name, String author, String catgory) {
        Map<Long, String> mapCatgory = catgoryController.getMapCatgory();
        Long catgoryId = -1L;
        for (Map.Entry<Long, String> entry : mapCatgory.entrySet()) {
            if (catgory.equals(entry.getValue())) {
                catgoryId = entry.getKey();
            }
        }
        return booksDAO.resultSearch(name, author, catgoryId);
    }
}
