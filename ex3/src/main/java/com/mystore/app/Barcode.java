package com.mystore.app;

import org.springframework.stereotype.Component;

@Component
public class Barcode {
    public void printBarcode() {
        System.out.println("Barcode: 123456789");
    }
}