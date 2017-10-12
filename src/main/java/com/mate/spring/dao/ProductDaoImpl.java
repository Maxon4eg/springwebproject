package com.mate.spring.dao;

import com.mate.spring.model.Product;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class ProductDaoImpl extends AbstractDao implements ProductDao {

    @Override
    public void addProduct(Product product) {
        //sessionFactory.getCurrentSession().save(product);
    }
}
