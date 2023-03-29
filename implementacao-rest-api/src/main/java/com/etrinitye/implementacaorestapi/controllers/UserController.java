package com.etrinitye.implementacaorestapi.controllers;

import com.etrinitye.implementacaorestapi.models.User;
import com.etrinitye.implementacaorestapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1")
public class UserController {

    //Injecao de dependencias
    @Autowired
    private UserService userService;

    //Read
    @GetMapping("user")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("user/{id}")
    public Optional<User> find(@PathVariable("id") Long id){
        return userService.findById(id);
    }

    @PostMapping("user")
    public User save(@RequestBody User user){
        return userService.save(user);
    }

    @PutMapping("user")
    public User update(@RequestBody User user){
        return userService.update(user);
    }

    @DeleteMapping("user/{id}")
    public String delete(@PathVariable("id") Long id){
        return userService.delete(id);
    }


}
