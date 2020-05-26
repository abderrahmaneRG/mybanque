package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dao.ClientRepository;

@SpringBootApplication
public class PfaApplication {

	@Autowired
	
	private  ClientRepository clientRepository;

	public static void main(String[] args) {
	 SpringApplication.run(PfaApplication.class, args);
			
	}

	@Autowired
	public void run(String... arg0) throws Exception {
	Client c1 =	clientRepository.save(new Client("abderrahmane","abdo.abdo@gmail.com"));
	Client c2 =	clientRepository.save(new Client("Rguibi","Rguibi.abdo@gmail.com"));

	}
}
