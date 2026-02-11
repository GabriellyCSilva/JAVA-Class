package com.fiap.curso.PrimeiroApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Annotation para criar uma controller produtora de endpoints
@RestController //A annotation sempre vem antes
public class MinhaController {

    //Criando o primeiro endpoint
    //Endpoint: http://localhost:8080/end-a
    //Annotation que cria um endpoint GET
    @GetMapping("/end-a")
    public String endpointA(){
        return "Bem-vindo ao endpointA";
    }
    //Criando o primeiro endpoint
    //Endpoint: http://localhost:8080/end-b
    //Annotation que cria um endpoint GET
    @GetMapping("/end-b")
    public String endpointB(){
        return "Bem-vindo ao endpointB";
    }

    //Endpoint com uma variável de caminho
    //Annotation para indicar uma variavel caminho  @PathVariable
    //Endpoint:http://localhost:8080/hello/nome
    @GetMapping("/hello/{nome}") //os nomes precisam ser igual (case sensitive)
    public String helloEnd(@PathVariable String nome){
        return "Olá " + nome;
    }
}
