package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

//@Repository , NAO E NECESSARIO PQ ESSA CLASSE JA ESTA HERDANDO DO JPAREPOSITORY, QUE É UM COMPONENTE JA REGISTRADO DO SPRING
public interface UserRepository extends JpaRepository<User, Long>{

}
