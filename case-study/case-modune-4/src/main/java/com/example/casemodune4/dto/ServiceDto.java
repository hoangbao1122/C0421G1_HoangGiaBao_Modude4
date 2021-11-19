package com.example.casemodune4.dto;

import com.example.casemodune4.model.entity.dichvu.RentType;
import com.example.casemodune4.model.entity.dichvu.ServiceType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class ServiceDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty(message = "ko de trong")
    private String name;
    @NotEmpty
    private String area;
    @Min(1)
    @Max(10)
    private double cost;
    @Min(1)
    @Max(10)
    private int maxPeople;
    @NotEmpty(message = "ko de trong")
    private String standardRoom;
    @NotEmpty(message = "ko de trong")
    private String description;
    @Min(1)
    @Max(2)
    private double pool;

    private double poolArea;
    @Min(1)
    @Max(2)
    private int numberOfFlorr;

    private RentType rentType;
    private ServiceType serviceType;

    public ServiceDto() {

    }

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

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }
}
