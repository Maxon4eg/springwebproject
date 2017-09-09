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

    @PostConstruct
    public void init() {
        Category category = new Category();
        category.setId(2);

        Product product1 = new Product();
        product1.setCategory(category);
        product1.setDescription("Just Nokia");
        product1.setPrice(40.0);
        product1.setProductName("Nokia");
        addProduct(product1);
    }

    @Override
    public void addProduct(Product product) {
        productDao.addProduct(product);
    }
}
