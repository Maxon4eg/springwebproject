package com.mate.spring.service;

import com.mate.spring.dao.CategoryDao;
import com.mate.spring.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public List<Category> getAllCategories() {
        List<Category> categories = categoryDao.getAllCategories();
        return categories;
    }
}
