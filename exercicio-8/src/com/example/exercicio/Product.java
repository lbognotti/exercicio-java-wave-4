package com.example.exercicio;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Product {
    String name;
    BigDecimal price;
    Integer quantity;

    public Product(String name, BigDecimal price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal total(BigDecimal price, Integer quantity) {
        BigDecimal qty = new BigDecimal(quantity);
        return price.multiply(qty);
    }

    @Override()
    public String toString() {
        return "Name: " + this.name + " - Price: " + NumberFormat.getCurrencyInstance().format(this.price) + " - Quantity: " + this.quantity;
    }
}
