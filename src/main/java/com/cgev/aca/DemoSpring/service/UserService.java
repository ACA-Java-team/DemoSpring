package com.cgev.aca.DemoSpring.service;

import com.cgev.aca.DemoSpring.dto.UserDTO;
import com.cgev.aca.DemoSpring.entity.UserEntity;
import com.cgev.aca.DemoSpring.repo.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDTO> getAllUser() {
        List<UserEntity> userEntities = userRepository.findAll();
        List<UserDTO> userDTOs = userEntities.stream().map(userEntity ->
                new UserDTO(userEntity.getId(), userEntity.getName(), userEntity.getEmail())).collect(Collectors.toList());
        return userDTOs;
    }

    public void addUser(UserDTO user) {
        userRepository.save(new UserEntity(user.getId(), user.getName(), user.getEmail()));
    }

    public UserDTO getUser(Integer id) {
        //TODO
        return null;
    }

    public void updateUser(UserEntity user) {
        //TODO
    }

    public void deleteUser(Integer id) {
        //TODO
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public List<UserDTO> getUsersByName(String name) {
        //return userRepository.findAllByName(name);
        return null;
    }
}
