package com.cgev.aca.DemoSpring.controller;

import com.cgev.aca.DemoSpring.dto.UserDTO;
import com.cgev.aca.DemoSpring.entity.UserEntity;
import com.cgev.aca.DemoSpring.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

//
@RestController
public class UserController {

    private final UserService service;

    UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/users")
    @ResponseStatus(HttpStatus.OK)
    public List<UserDTO> getAllUser(){
        return service.getAllUser();
    }


    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@Valid @RequestBody UserDTO user) {
        service.addUser(user);
    }

   /* @PostMapping("/allusers")
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser2(@RequestBody UserEntity user) {
        service.addUser(user);
    }

    @GetMapping("/users/{id}")
    public UserEntity getUser(@PathVariable Integer id) {
        return service.getUser(id);
    }

    @GetMapping("/users/names/{name}")
    public List<UserEntity> getUser(@PathVariable String name) {
        return service.getUsersByName(name);
    }

    @PutMapping("/users")
    public void updateUser(@RequestBody UserEntity user){
        service.updateUser(user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Integer id) {
        service.deleteUser(id);
    }*/

    public UserService getService() {
        return service;
    }
}