package com.buiminhduc.service.impl;

import com.buiminhduc.model.entity.RoleEntity;
import com.buiminhduc.model.entity.UserEntity;
import com.buiminhduc.model.request.UserDto;
import com.buiminhduc.model.request.UserRequest;
import com.buiminhduc.repository.UserRepository;
import com.buiminhduc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity save(UserDto userDto) {
        UserEntity userEntity = new UserEntity(userDto.getUserName(),passwordEncoder.encode(userDto.getPassword()),userDto.getPhone(),userDto.getFirstName(),userDto.getLastName(),userDto.getAddress(),userDto.getStatus(), Arrays.asList(new RoleEntity("USER")));
        return userRepository.save(userEntity);
    }
}
