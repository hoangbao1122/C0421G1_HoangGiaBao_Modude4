package com.example.casemodune4.model.respository.dichvu;

import com.example.casemodune4.model.entity.dichvu.ServiceEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IServiceRepository extends JpaRepository<ServiceEntity,Long> {
    Page<ServiceEntity> findByNameContaining(Pageable pageable, String name);
}
