package com.mate.spring.config;

import com.mate.spring.model.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class ProductTest {

    @Autowired
    Validator validator;

    @Test
    public void testValidation() {
        Product product = new Product();
        assertNotNull(product);

        Set<ConstraintViolation<Product>> constraintViolations = validator.validate(product);
        assertEquals( 2, constraintViolations.size());
    }
}
