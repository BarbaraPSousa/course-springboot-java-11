package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.ProductRepository;

@Service//registando class como serviço
public class ProductService {
	
	@Autowired//injeção de depedencia
	private ProductRepository repository;
	
	public List<Product> findAll(){//retorna todos os usuarios do banco de dados
		return repository.findAll();
	}
	
	public Product findById(Long id) {//retorna todos os usuarios por id
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
