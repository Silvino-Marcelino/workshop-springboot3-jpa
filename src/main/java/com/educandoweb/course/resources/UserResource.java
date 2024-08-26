package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){ // ISSO AQUI É O CONTROLADOR REST QUE RESPONDE NO CAMINHO USER, FOI FEITO SO PARA TESTAR SE ESTA TUDO OK;
		User u = new User(1L, "Pedro", "pedro@gmail.com", "(47)99602-3734", "Silvino213210");
		return ResponseEntity.ok().body(u);
	}
}
