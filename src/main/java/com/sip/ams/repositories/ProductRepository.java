package com.sip.ams.repositories;


import org.springframework.data.repository.CrudRepository;

import com.sip.ams.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
     
    public Product findByName(String name);
}
