package com.akhil.webapplication.dao;

import com.akhil.webapplication.model.Order;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class OrderRepo {

    public List<Order>  orderDeatils(){

        return Stream.of(
                new Order(1,"Phone", 2, 234.43),
                new Order(2,"MAC", 2, 3344.43),
                new Order(3,"PC", 2, 334.43),
                new Order(4,"Nike", 2, 84.43))
                .collect(Collectors.toList());




    }
}
