package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;
import com.educandoweb.course.services.exceptions.ResourceNotFoundException;

@Service//registando class como serviço
public class UserService {
	
	@Autowired//injeção de depedencia
	private UserRepository repository;
	
	public List<User> findAll(){//retorna todos os usuarios do banco de dados
		return repository.findAll(); 
	}
	
	public User findById(Long id) {//retorna todos os usuarios por id
		Optional<User> obj = repository.findById(id); //tras o bjs do banco de dados
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {// retorna um usoriao cadastrado
		return repository.save(obj);
	}
	
	public void delete(Long id) {// deleta Usuario com o Id
		repository.deleteById(id);
		
	}
	
	public User update(Long id, User obj) {//atualizando usuario passando id
		User entity = repository.getById(id);
		update(entity, obj);
		return repository.save(entity);
	}

	private void update(User entity, User obj) {//retorna os dados atualizados com base no q foi passado no obj
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
