package com.example.casemodune4.model.respository.emp;

import com.example.casemodune4.model.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRespository extends JpaRepository<User,Long> {
}
