package com.example.systemagro.controller;

import com.example.systemagro.models.User;
import com.example.systemagro.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping()
    public ArrayList<User> Users (){
        return userService.Users();
    }

    @PostMapping()
    public User SaverUser(@RequestBody User UserNew){
        return this.userService.SaveUser(UserNew);
    }

    @GetMapping(path = "/{Id}")
    public Optional<User> UserById(@PathVariable("Id") Long Id){
        return userService.UserById(Id);

    }

    @DeleteMapping(path = "/{Id}")
    public String DeletUserById(@PathVariable("Id") Long Id){
        return userService.DeleteUser(Id);
    }

/*    @GetMapping("/query")
    public ArrayList<User> UserByRol(@PathVariable("rol") Integer Id){
        return userService.UserByRol(Id);

    }*/
}
