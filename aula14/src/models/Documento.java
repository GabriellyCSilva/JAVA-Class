package models;

//Records providenciam classes rápidas que são capazes de criar objetos imutáveis, sem execessão
//Produzem automaticamente construtores e getters para as suas propriedades
//Não tem setter porque é imutável, ou seja, não preciso usar setter
//São utilizadas geralmente para abrigar um conceito chamado de DTO (Data Transfer Object) - serve para pegar dados de outra fontes, trazer para minha aplicação e utilizar de forma rápida
//Se o meu banco de dados mudar, preciso refazer o DTO

//public record Documento(Escrevemos a propriedade) {
//
//}

public record Documento(String cpf, String rg) {
    //Não preciso programar nada, a não ser que tenha necessidade de algum mét0do a mais

}
