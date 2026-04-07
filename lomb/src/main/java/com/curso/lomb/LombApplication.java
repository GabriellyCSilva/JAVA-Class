package com.curso.lomb;

import com.curso.lomb.models.Person;
import com.curso.lomb.services.PersonCreateService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombApplication.class, args);

		testador();
	}

	//==========Zona teste============
	private static PersonCreateService personCreateService;

	public LombApplication(PersonCreateService personCreateService) {
		this.personCreateService = personCreateService;
	}

	public static  void testador(){

		Person personA = Person.builder()
				.name("Joaquim")
				.cpf("000.000.000-00")
				.build();

		System.out.println(personA.getName());
		System.out.println(personA.getCpf());

		personA.setName("Maria da Silva");
		System.out.println(personA);

		personCreateService.create(personA);

	}

}
