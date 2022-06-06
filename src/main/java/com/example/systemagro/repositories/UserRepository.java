package com.example.systemagro.repositories;


import com.example.systemagro.models.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
/*    public abstract ArrayList<User> findByRol(Integer rol);*/
}
