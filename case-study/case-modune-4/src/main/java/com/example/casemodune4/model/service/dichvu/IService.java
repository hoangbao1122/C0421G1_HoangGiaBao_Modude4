package com.example.casemodune4.model.service.dichvu;

import com.example.casemodune4.model.entity.dichvu.ServiceEntity;
import com.example.casemodune4.model.service.IGenericFurama;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IService extends IGenericFurama<ServiceEntity> {
    Page<ServiceEntity> search(Pageable pageable, String name);
}
