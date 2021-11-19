package com.example.thi.model.entity.product;

import javax.persistence.*;

@Entity
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idOrder;
    private String startDateOrder;


    @ManyToOne(targetEntity = Product.class)
    @JoinColumn(name = "order_id",referencedColumnName = "idProduct")
    private Product products;

    public OrderEntity(){

    }
    public long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(long idOrder) {
        this.idOrder = idOrder;
    }

    public String getStartDateOrder() {
        return startDateOrder;
    }

    public void setStartDateOrder(String startDateOrder) {
        this.startDateOrder = startDateOrder;
    }

    public Product getProduct() {
        return products;
    }

    public void setProduct(Product product) {
        this.products = product;
    }

    public Product getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }


}
