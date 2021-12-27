package io.agusprayogi02.myapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private Long id;
    private String code;
    private String nama;
    private double price;

    public Product(long l, String string, String string2, double d) {
    }
}
