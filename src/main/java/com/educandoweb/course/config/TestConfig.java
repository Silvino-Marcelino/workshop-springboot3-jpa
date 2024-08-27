package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{ // ESSE COMMANDLINE É PARA QUE ESSA CLASSE TEST SEJA EXECUTADA QUANDO O PROGRAMA FOR EXECUTADO
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception { // ESSES USERS VAO SER EXECUTADO QUANDO O PROGRAMA FOR EXECUTADO
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2)); // ESSA LINHA E PRA SALVAR OS 2 USUARIOS NO BANCO, O SAVEALL E PARA SALVAR EM FORMA DE LISTA
	}
}
