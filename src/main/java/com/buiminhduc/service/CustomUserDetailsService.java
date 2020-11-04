package com.buiminhduc.service;

import com.buiminhduc.model.entity.RoleEntity;
import com.buiminhduc.model.entity.UserEntity;
import com.buiminhduc.model.request.UserRequest;
import com.buiminhduc.repository.UserRepository;
import com.buiminhduc.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    //lay ra để chạy lên ui
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity= userRepository.findOneByUserNameAndStatus(username, Constant.ACTIVE_STATUS);
        if (userEntity==null){
            throw new UsernameNotFoundException("User not found");
        }
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (RoleEntity entity: userEntity.getRoleEntities()) {
            authorities.add(new SimpleGrantedAuthority(entity.getCode()));
        }
        UserRequest userRequest= new UserRequest(userEntity.getUserName(),userEntity.getPassword(),true,true,true,true,authorities);
        userRequest.setFullName(userEntity.getFirstName()+" "+userEntity.getLastName());
        return userRequest;
    }

}
