package com.example.systemagro.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.systemagro.models.Product;

@Repository
public interface InterfaceProducto extends CrudRepository<Product, Integer> {

}
