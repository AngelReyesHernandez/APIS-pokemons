package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Pokemons1Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(Pokemons1Application.class, args);
	}
	
	

    @RestController
    public static class WarInitializerController {

        @GetMapping("/")
        public String handler() {
           return "Proyecto Iniciado!";
        }
    }

}
