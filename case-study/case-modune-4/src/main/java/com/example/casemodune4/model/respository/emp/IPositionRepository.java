package com.example.casemodune4.model.respository.emp;

import com.example.casemodune4.model.entity.emp.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPositionRepository extends JpaRepository<Position,Long> {
}
