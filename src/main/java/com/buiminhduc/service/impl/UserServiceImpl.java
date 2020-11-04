package com.buiminhduc.service.impl;

import com.buiminhduc.model.entity.RoleEntity;
import com.buiminhduc.model.entity.UserEntity;
import com.buiminhduc.model.request.UserRequest;
import com.buiminhduc.repository.UserRepository;
import com.buiminhduc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Arrays;

public class UserServiceImpl implements IUserService {

    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity save(UserRequest userRequest) {
        UserEntity userEntity = new UserEntity(userRequest.getUsername(),passwordEncoder.encode(userRequest.getPassword()),userRequest.getPhone(),userRequest.getFirstName(),userRequest.getLastName(),userRequest.getAddress(),userRequest.getStatus(), Arrays.asList(new RoleEntity("USER")));
        return userRepository.save(userEntity);
    }
}
