package models;

//Para indicar uma classe genérica, utilizamos uma propriedade genérica

//O nome da propriedade é muito importante, ele pode ser definido por uma letra
//Letras mais utilizadas para nome de propriedade de generios:
//T - Type
//E - Element
//N - Number
//K - Key
//V -  Value

//public class ImpressoraGenerica <NomeDaPropriedade> {
//
//
//}

public class ImpressoraGenerica <T> {

    //DONE: Propriedades
    private T dado;

    //DONE: Construtores
    public ImpressoraGenerica(T dado) {
        this.dado = dado;
    }


    //DONE: Getters e Setters
    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    //DONE: Métodos
    public void imprimirDado(){
        System.out.println(dado);
    }

}
