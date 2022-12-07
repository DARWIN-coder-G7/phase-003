package com.adminon.sporty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.adminon.sporty.entity.*;
import com.adminon.sporty.repository.*;
@SpringBootApplication
public class SportyApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SportyApplication.class, args);
	}
    @Autowired
	private ProductRepository pr;
    
	@Override
	public void run (String... args) throws Exception {
		
	}
}
