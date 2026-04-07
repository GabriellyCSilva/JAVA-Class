package com.curso.lomb.services;

import com.curso.lomb.models.Person;
import com.curso.lomb.repositories.PersonRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonCreateService {

    //A palavra final cria a instancia de repo, ela é uma propriedade final, imutavel
    private final PersonRepo personRepo;

    public void create(Person person) {

        try {
            personRepo.save(person);
            System.out.println("Registro Salvo com sucesso.");
        }
        catch (Exception exception){
            System.out.println(exception);
        }
    }

}
