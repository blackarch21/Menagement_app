package com.example.accounting_app.repository;

import com.example.accounting_app.io.entity.UserEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<UserEntity, Long> {
    
    UserEntity findByEmail(String email);
    UserEntity findByUserid(String userid);
}
