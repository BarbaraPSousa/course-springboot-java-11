package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepository;

@Service//registando class como serviço
public class CategoryService {
	
	@Autowired//injeção de depedencia
	private CategoryRepository repository;
	
	public List<Category> findAll(){//retorna todos os usuarios do banco de dados
		return repository.findAll();
	}
	
	public Category findById(Long id) {//retorna todos os usuarios por id
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
