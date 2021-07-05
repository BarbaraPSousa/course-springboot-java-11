package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Configuration//indicação de que é uma class expecifica de configuração
@Profile("test")//informa que só vai roda a configuração quando tiver no perfil de teste.
public class TestConfig implements CommandLineRunner{

	@Autowired//associa a intacia no test
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {//tudo que colocar na função sera executado quando a aplicação rodar.
	
	User u1 = new User(null, "Maria Brown", "maria@gmail.com", "169599999","123456");
	User u2 = new User(null, "Alex Green", "alex@gmail.com", "179865555", "5297835");
	
	userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
