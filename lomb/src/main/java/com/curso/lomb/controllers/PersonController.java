package com.curso.lomb.controllers;

import com.curso.lomb.models.Person;
import com.curso.lomb.services.PersonCreateService;
import com.curso.lomb.services.PersonListService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonController {
    private final PersonCreateService createService;
    private final PersonListService listService;

    //Endpoint: http://localhost:8080/persons
    //Body: {"name"  : "Um Nome", "age" : 20, "email" : "um@mail.com", "cpf" : "um cpf valido"}
    @PostMapping
    public Person create(@RequestBody Person person) {
        createService.create(person);
        return person;
    }

    @GetMapping
    public List<Person> list() {
        return listService.listAll();
    }
}
