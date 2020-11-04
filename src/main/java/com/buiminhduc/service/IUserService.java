package com.buiminhduc.service;

import com.buiminhduc.model.entity.UserEntity;
import com.buiminhduc.model.request.UserRequest;
import com.buiminhduc.repository.UserRepository;

public interface IUserService {
    UserEntity save(UserRequest userRequest);
}
