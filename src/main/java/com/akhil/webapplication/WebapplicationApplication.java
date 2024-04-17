package com.akhil.webapplication;

import com.akhil.webapplication.dao.OrderRepo;
import com.akhil.webapplication.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
@RestController
@RequestMapping("/orders")
public class WebapplicationApplication {
@Autowired
	private OrderRepo repo;

    @GetMapping
	public List<Order> fetchOrder(){

		return repo.orderDeatils()
				.stream()
				.sorted(Comparator.comparing(Order::getPrice))
				.collect(Collectors.toList());

	}

	public static void main(String[] args) {
		SpringApplication.run(WebapplicationApplication.class, args);
	}

}
