package com.example.casemodune4.model.entity.dichvu;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ServiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idServiceType;
    private String nameServiceType;

    @OneToMany(mappedBy = "serviceTypes")
    private Set<ServiceEntity>services;

    public long getIdServiceType() {
        return idServiceType;
    }

    public void setIdServiceType(long idServiceType) {
        this.idServiceType = idServiceType;
    }

    public String getNameServiceType() {
        return nameServiceType;
    }

    public void setNameServiceType(String nameServiceType) {
        this.nameServiceType = nameServiceType;
    }

    public Set<ServiceEntity> getServices() {
        return services;
    }

    public void setServices(Set<ServiceEntity> services) {
        this.services = services;
    }
}
