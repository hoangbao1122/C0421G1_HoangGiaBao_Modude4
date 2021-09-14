package com.example.phone.model.repository;

import com.example.phone.model.entity.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISmartphoneRepository extends JpaRepository<Smartphone,Long> {
}
