package com.cgev.aca.DemoSpring.dto;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

//DTO - Data Transfer Object
public class UserDTO {
    @Column(name = "id")
    private Integer id;

    @NotNull(message = "Name field could not be null")
    @NotEmpty()
    private String name;

    @Email(message = "Please write correct email")
    private String email;

    private String test;
    public UserDTO() {

    }

    public UserDTO(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}