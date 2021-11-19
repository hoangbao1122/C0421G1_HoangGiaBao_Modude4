package com.example.thi.dto;

import com.example.thi.model.entity.product.OrderEntity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class ProductDto {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProduct;
    @NotEmpty(message = "must not be empty .")
    private String nameProduct;
    @NotEmpty(message = "must not be empty .")
    private String price;
    @NotEmpty(message = "must not be empty .")
    private String typeProduct;
    @Min(value = 1, message = "number > 1 .")
    @Max(value = 10, message = "number < 10 .")
    private int quantity;

    private OrderEntity orderEntity;
    public ProductDto(){

    }

    public long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(long idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(String typeProduct) {
        this.typeProduct = typeProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public OrderEntity getOrderEntity() {
        return orderEntity;
    }

    public void setOrderEntity(OrderEntity orderEntity) {
        this.orderEntity = orderEntity;
    }
}
