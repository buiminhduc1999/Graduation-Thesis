package com.buiminhduc.repository;

import com.buiminhduc.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
    UserEntity findOneByUserNameAndStatus(String name, int status);
}
