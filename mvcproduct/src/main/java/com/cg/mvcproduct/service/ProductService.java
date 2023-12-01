package com.cg.mvcproduct.service;

import com.cg.mvcproduct.bean.Product;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductService {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void saveUser(Product product) {
        entityManager.persist(product);
    }

    public Product getProductById(Long productId) {
        return entityManager.find(Product.class, productId);
    }
}
