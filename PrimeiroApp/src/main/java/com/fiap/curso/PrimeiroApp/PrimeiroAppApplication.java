package com.fiap.curso.PrimeiroApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//Annotations são metadados que a lingua utiliza para agregar informações e estruturas aos nossos projetos
//A Spring é 100% baseada em annotations

//@SpringBootApplication percorre tod0 o projeto procurando por todas as outras anotações, dispara essas anotações e roda sua aplicação
@SpringBootApplication
public class PrimeiroAppApplication { // aperta o run e pesquisa no navegador http://localhost:8080/

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroAppApplication.class, args);
	}

}
