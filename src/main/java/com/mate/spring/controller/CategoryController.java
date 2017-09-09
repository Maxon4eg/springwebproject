package com.mate.spring.controller;

import com.mate.spring.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/categories")
    public ModelAndView getAllCategories() {
        return new ModelAndView("categories", "categories", categoryService.getAllCategories());
    }

}
