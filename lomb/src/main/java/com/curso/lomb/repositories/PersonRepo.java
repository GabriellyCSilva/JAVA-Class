package com.curso.lomb.repositories;

import com.curso.lomb.models.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepo extends CrudRepository< Person, Integer > {


}
