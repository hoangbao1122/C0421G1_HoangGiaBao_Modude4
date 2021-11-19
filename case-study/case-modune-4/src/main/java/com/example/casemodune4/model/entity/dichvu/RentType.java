package com.example.casemodune4.model.entity.dichvu;

import javax.persistence.*;
import java.util.Set;

@Entity
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long rendTypeid;
    private String rendTypeName;
    private String rendTypeCost;

    @OneToMany(mappedBy = "rentType")
    private Set<ServiceEntity> services;

    public long getRendTypeid() {
        return rendTypeid;
    }

    public void setRendTypeid(long rendTypeid) {
        this.rendTypeid = rendTypeid;
    }

    public String getRendTypeName() {
        return rendTypeName;
    }

    public void setRendTypeName(String rendTypeName) {
        this.rendTypeName = rendTypeName;
    }

    public String getRendTypeCost() {
        return rendTypeCost;
    }

    public void setRendTypeCost(String rendTypeCost) {
        this.rendTypeCost = rendTypeCost;
    }

    public Set<ServiceEntity> getServices() {
        return services;
    }

    public void setServices(Set<ServiceEntity> services) {
        this.services = services;
    }
}
