package com.akhil.webapplication;

import com.akhil.webapplication.dao.OrderRepo;
import com.akhil.webapplication.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class WebapplicationApplication {
@Autowired
	private OrderRepo repo;


	public List<Order> fetchOrder(){

		return repo.orderDeatils();
	}

	public static void main(String[] args) {
		SpringApplication.run(WebapplicationApplication.class, args);
	}

}
