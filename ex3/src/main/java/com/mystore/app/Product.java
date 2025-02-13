package com.mystore.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Product {
    private String name;
    private double price;
    private Barcode barcode;

    @Autowired
    public Product(Barcode barcode) {
        this.name = "Tumbler";
        this.price = 99.99;
        this.barcode = barcode;
    }

    public void display() {
        System.out.println("Product: " + name + ", Price: " + price);
        barcode.printBarcode();
    }
}