package models;

//Essa classe herdará de Cliente

//Para indicar que a classe herda da outra classe:
public class PessoaFisica extends Cliente{ //Só posso herdar de uma única classe

    //DONE: Propeiredades
    private String nome;
    private  String cpf;

    //DONE: Construtores
    public PessoaFisica(String numConta, String dataAdesao, String nome, String cpf) { //Ele também traz da outra classe
        //Super: Faz a execução do construtor da classe pai
        super(numConta, dataAdesao); //Muito importante
        this.nome = nome;
        this.cpf = cpf;
    }

    //DONE: GETTERS
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    //DONE: SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //TODO: Métodos Sobrescritos
    @Override //Indica que o métod0 é uma sobrescrita - utilização é opcional
    public void imprimirDado() {
        //super.imprimirDado(); //Super: quando presente executa também o métod0 da classe pai
        System.out.println("==== Dados do Cliente =====");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        //Ele dá erro quando puxamos pelo nome da string pq está privado, para solucionar esse problema, puxamos pelo get
        System.out.println("Numero de conta " + getNumConta());
        System.out.println("Adesão: " + getDataAdesao());
        System.out.println("============================");

    }
}
