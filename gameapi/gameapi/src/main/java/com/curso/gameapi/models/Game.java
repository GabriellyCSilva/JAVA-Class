package com.curso.gameapi.models;

import jakarta.persistence.*;

import java.time.Year;

//Vai virar uma entidade no banco e dados (minha tabela)
@Entity //Responsável por levar uma classe como uma entidade para o db
//Aqui é o so objeto game, sem regra de negócio
public class Game {

    //Propriedades

    @Id //Indica chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Não vamos gerar no lado da aplicação, ele vai ser auto generativo
    private Integer id;

    @Column //Tudo depois da anotação, se torna aquilo
    private String title;

    @Column //Indica um campo/coluna em uma entidade
    private String publisher;

    @Column
    private String gender;

    @Column
    private Year realeseYear;

    //Construtores
    public Game(String title, String publisher, String gender, Year year) {
        this.title = title;
        this.publisher = publisher;
        this.gender = gender;
        this.realeseYear = realeseYear;
    }


    //Getters
    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getGender() {
        return gender;
    }

    public Year getYear() {
        return realeseYear;
    }


    //Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setYear(Year realeseYear) {
        this.realeseYear = realeseYear;
    }


    //Métodos sobrescritos
    //Usamos para imprimir com uma melhor visualização
    //Modelagem de dados do lado do banco de dados também
    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", gender='" + gender + '\'' +
                ", realeseYear=" + realeseYear +
                '}';
    }
}
