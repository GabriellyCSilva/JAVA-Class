import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Explicando Escopos

        //Trabalhando com Parênteses
        //Abrigam TUPLAS DE DADOS (Conjunto de Dados)
        String nome = "Antonio";
        int idade = 60;
        float altura = 1.75f;
        System.out.println(nome + " "+ idade + " " + altura);  //dentro do parenteses posso colocar um conunto de dados quaisquer

        //Trabalhando com Colchetes
        //Representam COLEÇÕES DE DADOS - [Um conjunto de dados do mesmo tipo]
        String[] frutaComM = {"mamão", "melão", "melancia"}; //Toda vez que temos [], vamos começar um conjunto de dados do mesmo tipo

        //Trabalhando com Chaves
        //Representa um bloco de Execução, ou seja, tudo que estiver dentro do blobo, será executado em ordem
        var horaDoDia = 10;

        if(horaDoDia < 18){
            System.out.println("Hora informada: " + horaDoDia);
            System.out.println("Que dia lindo!");
        }
        else {
            System.out.println("Hora informada: " + horaDoDia);
            System.out.println("Que noite linda!");
        }

        //Trabalhando com Diamante <Tipo Genérico>
        ArrayList<Integer> idadeDosFuncionarios = new ArrayList<>();  //Não precisamos passar o diamente duas vezes, só no primeiro
        idadeDosFuncionarios.add(18);
        idadeDosFuncionarios.add(50);
        idadeDosFuncionarios.add(20);
        //Para tirar
        idadeDosFuncionarios.remove(0); //Passamos o index

        }
    }
