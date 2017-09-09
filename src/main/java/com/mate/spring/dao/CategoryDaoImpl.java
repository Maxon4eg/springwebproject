package com.mate.spring.dao;

import com.mate.spring.model.Category;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class CategoryDaoImpl extends AbstractDao implements CategoryDao {

    @Override
    public List<Category> getAllCategories() {
        return sessionFactory.getCurrentSession().createCriteria(Category.class).list();
    }
}
