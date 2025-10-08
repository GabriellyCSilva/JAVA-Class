import models.Calc;

public class Main {
    public static void main(String[] args) {

        //Criando objetos de calculo

        Calc calA = new Calc(10, 10);

        System.out.println(calA.getValorA());
        System.out.println(calA.getValorB());

        calA.setValorA(15);
        calA.setValorB(25);

        System.out.println(calA.toString());

        calA.somarDoisValores();
        calA.subtrairDoisValores();
        calA.identificarUsuario("jose");

    }
}