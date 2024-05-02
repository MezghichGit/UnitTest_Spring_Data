package com.sip.ams.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sip.ams.entities.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
     
    public Product findByName(String name);
}
