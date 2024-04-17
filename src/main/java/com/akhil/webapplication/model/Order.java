package com.akhil.webapplication.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    private Integer id;

    private String name;
    private Integer quantity;

    private  double price;
}
