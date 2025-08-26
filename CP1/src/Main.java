public class Main {
    public static void main(String[] args) {

        Tutor tutorA = new Tutor();
        Tutor tutorB = new Tutor();

        tutorA.nome = "Joaquim José";
        tutorA.idade = 44;
        tutorA.cpf = "111.111.111-11";

        tutorB.nome = "Francisca Maria";
        tutorB.idade = 20;
        tutorB.cpf = "222.222.222-22";

        tutorA.imprimirDados();
        System.out.println(" ");
        tutorB.imprimirDados();
        System.out.println(" ");
        System.out.println(" ");

        Pet petA = new Pet();
        Pet petB = new Pet();
        Pet petC = new Pet();
        Pet petD = new Pet();

        petA.id = 1;
        petA.nome = "Caramelo";
        petA.raca = "Vira lata";
        petA.cor = "Amarela";
        petA.idade = 8;

        petB.id = 4;
        petB.nome = "Xuxa";
        petB.raca = "Dálmata";
        petB.cor = "Branca";
        petB.idade = 3;

        petC.id = 3;
        petC.nome = "Lola";
        petC.raca = "Golden Retriever";
        petC.cor = "Amarela";
        petC.idade = 4;

        petD.id = 2;
        petD.nome = "Bolinha";
        petD.raca = "Pinscher";
        petD.cor = "Preta";
        petD.idade = 12;


        petA.imprimirDados();
        petB.imprimirDados();
        petC.imprimirDados();
        petD.imprimirDados();





    }
}