package com.gestaofinanceira.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Classe para iniciar a aplicação Spring Boot, anotada com @SpringBootApplication, 
// que é uma combinação de @Configuration, @EnableAutoConfiguration e @ComponentScan, 
// facilitando a configuração e inicialização da aplicação.
@SpringBootApplication // Anotação para indicar que esta é a classe principal da aplicação Spring Boot
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

}
