package com.buiminhduc.service;

import com.buiminhduc.model.entity.UserEntity;
import com.buiminhduc.model.request.UserDto;
import com.buiminhduc.model.request.UserRequest;
import com.buiminhduc.repository.UserRepository;
import org.springframework.stereotype.Service;

public interface UserService {
    UserEntity save(UserDto userDto);
}
