package com.educandoweb.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.entities.enums.OrderStatus;
import com.educandoweb.course.repositories.CategoryRepository;
import com.educandoweb.course.repositories.OrderRepository;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{ // ESSE COMMANDLINE É PARA QUE ESSA CLASSE TEST SEJA EXECUTADA QUANDO O PROGRAMA FOR EXECUTADO
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository CategoryRepository;
	
	@Override
	public void run(String... args) throws Exception { // ESSES USERS VAO SER EXECUTADO QUANDO O PROGRAMA FOR EXECUTADO
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.SHIPPED, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);
		
		Category cat1 = new Category(null, "Electronics"); 
		Category cat2 = new Category(null, "Books"); 
		Category cat3 = new Category(null, "Computers");
		
		userRepository.saveAll(Arrays.asList(u1, u2)); // ESSA LINHA E PRA SALVAR OS 2 USUARIOS NO BANCO, O SAVEALL E PARA SALVAR EM FORMA DE LISTA
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		CategoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
	}
}
