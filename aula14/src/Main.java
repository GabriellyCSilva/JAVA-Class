import models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Criando objetos baseados em records

        Documento docA = new Documento("000.000.000-00","00.000.000-0");
        //Não vamos utilizar sempre por ele ser imutável, só conseguimos captar o dado
        //Ele é ótimo para transferir o dado, mas ainda sim não substitui uma classe
        System.out.println(docA.cpf());
        System.out.println(docA.rg());

        //Trabalhando com genéricos
        //Ele pode ser mais de um tipo
        ArrayList<String> beatles = new ArrayList<>();
        //O diamante <> é um indicativo da utilização de genéricos
        //Precisamos utilizar o diamante, é regra
        beatles.add("John");
        beatles.add("Paul");
        beatles.add("George");
        beatles.add("Ringo");

        //É possível criar classes genéricas

        //Trabalhando com tipos sem genéricos
        ImpressoraString dadoA = new ImpressoraString("Teste");
        dadoA.imprimirDado();

        ImpressoraInteger dadoB = new ImpressoraInteger(10);
        dadoB.imprimirDado();

        //Utilizando impressora genérica
        ImpressoraGenerica<Integer> dadoc = new ImpressoraGenerica<>(20);
        ImpressoraGenerica<String> dadod = new ImpressoraGenerica<>("Oi");

        //Genéricos nãoconseguem trabalhar com primitivos, apenas com classes, ou seja, não consigo imprimir um dado primitivo

        //Utilizando Coordenadas
        Coordenadas<String, Integer> coordA = new Coordenadas("245",444);
        coordA.imprimirCoordenadas();


    }
}