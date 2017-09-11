package com.mate.spring.service;

import com.mate.spring.dao.ProductDao;
import com.mate.spring.model.Category;
import com.mate.spring.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public void addProduct(Product product) {
        productDao.addProduct(product);
    }
}
