package models;

//Cliente será nossa classe mais abstrata
//Dará origem a demais
public class Cliente {

    //DONE: Propriedades
    private String numConta;
    private String dataAdesao;

    //DONE: Construtores
    //alt + insert: Gera o construtor automaticamente

    public Cliente(String numConta, String dataAdesao) {
        this.numConta = numConta;
        this.dataAdesao = dataAdesao;
    }

    //DONE: GETTERS
    public String getNumConta() {
        return numConta;
    }

    public String getDataAdesao() {
        return dataAdesao;
    }

    //DONE: SETTERS

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public void setDataAdesao(String dataAdesao) {
        this.dataAdesao = dataAdesao;
    }

    //DONE: Métodos de classe
    public void imprimirDado(){
        System.out.println("==== Dados do Cliente =====");
        System.out.println("Numero de conta " + numConta);
        System.out.println("Adesão: " + dataAdesao);
        System.out.println("============================");
    }

}
