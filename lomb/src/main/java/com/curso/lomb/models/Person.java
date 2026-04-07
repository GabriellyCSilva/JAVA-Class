package com.curso.lomb.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@NoArgsConstructor //Cria o construtor padrão
@AllArgsConstructor //Cria construtor com todos os parâmetros
@Builder //Cria um builder para preencher os campos necessários
@Getter //Cria todos os getters
@Setter //Cria todos os Setters
@ToString //Cria a sobrescrita de toString

public class Person {

    //Propriedades
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String cpf;

}
