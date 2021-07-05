package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Service//registando class como serviço
public class UserService {
	
	@Autowired//injeção de depedencia
	private UserRepository repository;
	
	public List<User> findAll(){//retorna todos os usuarios do banco de dados
		return repository.findAll();
	}
	
	public User findById(Long id) {//retorna todos os usuarios por id
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
