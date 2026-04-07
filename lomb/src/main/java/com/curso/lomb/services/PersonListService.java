package com.curso.lomb.services;

import com.curso.lomb.models.Person;
import com.curso.lomb.repositories.PersonRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonListService {

    private final PersonRepo personRepo;

    //A opção é java.util para esse caso
    public List<Person> listAll() {

        List<Person> personList = new ArrayList<>();

        try {
            personRepo.findAll().forEach(person -> {
                personList.add(person);
                System.out.println(person);
            });
        }
        catch (Exception exception){
            System.out.println(exception);
        }

        return personList;
    }
}
