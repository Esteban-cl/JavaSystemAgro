package com.example.systemagro.services;

import com.example.systemagro.models.User;
import com.example.systemagro.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public ArrayList <User> Users(){
        return (ArrayList<User>) userRepository.findAll();
    }

    public User SaveUser(User UserNew){
        return userRepository.save(UserNew);
    }

    public Optional<User> UserById(Long Id){
        return userRepository.findById(Id);
    }

/*    public ArrayList<User> UserByRol(Integer Id){
        return userRepository.findByRol(Id);
    }*/

    public User UpdateUser(User UserUpdate){
        return userRepository.save(UserUpdate);
    }

    public String DeleteUser(Long Id){
        try {
            userRepository.deleteById(Id);
            return "Se a eliminado el Usuario con el Id "+Id+" Correctamente.";
        }catch (Exception e){
            return "No se pudo eliminar el Usuario Intentalo de Nuevo";
        }
    }
}
