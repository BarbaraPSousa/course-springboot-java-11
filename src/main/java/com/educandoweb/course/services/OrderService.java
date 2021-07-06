package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;

@Service//registando class como serviço
public class OrderService {
	
	@Autowired//injeção de depedencia
	private OrderRepository repository;
	
	public List<Order> findAll(){//retorna todos os usuarios do banco de dados
		return repository.findAll();
	}
	
	public Order findById(Long id) {//retorna todos os usuarios por id
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
