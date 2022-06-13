package com.example.systemagro.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.systemagro.models.Specie;

@Repository
public interface InterfaceEspecie extends CrudRepository<Specie, Integer> {

}
