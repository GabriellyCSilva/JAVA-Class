import models.PessoaFisica;
import models.PessoaJuridica;

public class Main {
    public static void main(String[] args) {
        //Nome de pacotes sempre em minusculo e no plural
        //Criar o model e dentro do model criar um javaclass
        //O nome da classe sempre começa com letra maiúscula

        //Criando objetos
        //Não pode deixar de colocar nenhuma informação
        PessoaFisica pessoaFisicaA = new PessoaFisica(
                "000-00",
                "22/02/2022",
                "Gabrielly Candido",
                "222.222.222-22"
        );
        pessoaFisicaA.imprimirDado();

        PessoaJuridica pessoaJuridicaA = new PessoaJuridica(
                "2121212121",
                "22/22/2222",
                "OIOIOIOIOI",
                "2121212121212"
        );
        pessoaJuridicaA.imprimirDado();



    }
}
