package models;

public class PessoaJuridica extends  Cliente{

    //DONE: Propriedades
    private String razaoSocial;
    private String cnpj;

    //DONE: Construtores
    public PessoaJuridica(String numConta, String dataAdesao, String razaoSocial, String cnpj) {
        super(numConta, dataAdesao);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    //DONE: GETTERS
    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    //DONE: SETTERS
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    //DONE: Metod0s Sobrescristos
    @Override
    public void imprimirDado() {
        System.out.println("==== Dados do Cliente =====");
        System.out.println("Razão Social: " + razaoSocial);
        System.out.println("CNPJ: " + cnpj);
        //Ele dá erro quando puxamos pelo nome da string pq está privado, para solucionar esse problema, puxamos pelo get
        System.out.println("Numero de conta " + getNumConta());
        System.out.println("Adesão: " + getDataAdesao());
        System.out.println("============================");
    }
}
