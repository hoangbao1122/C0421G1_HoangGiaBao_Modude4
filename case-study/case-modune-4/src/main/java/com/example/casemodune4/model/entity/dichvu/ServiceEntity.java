package com.example.casemodune4.model.entity.dichvu;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ServiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String area;
    private double cost;
    private int maxPeople;
    private String standardRoom;
    private String description;
    private double pool;
    private double poolArea;
    private int numberOfFlorr;

    @ManyToOne(targetEntity = ServiceType.class)
    @JoinColumn(name = "service_type_id",referencedColumnName = "idServiceType")
    private ServiceType serviceTypes;


    @ManyToOne(targetEntity = RentType.class)
    @JoinColumn(name = "rend_type_id", referencedColumnName = "rendTypeid")
    private RentType rentType;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPool() {
        return pool;
    }

    public void setPool(double pool) {
        this.pool = pool;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFlorr() {
        return numberOfFlorr;
    }

    public void setNumberOfFlorr(int numberOfFlorr) {
        this.numberOfFlorr = numberOfFlorr;
    }

    public ServiceType getServiceTypes() {
        return serviceTypes;
    }

    public void setServiceTypes(ServiceType serviceTypes) {
        this.serviceTypes = serviceTypes;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

}
