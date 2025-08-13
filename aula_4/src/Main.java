public class Main {
    public static void main(String[] args) {

        //Tipo primitivos
        int numInteriro = 10;
        float numDec = 8.7575f;
        char caractere = 'b';

        //Trabalhando com classes
        String umTexto = "UmTexto"; //Todas as vezes que vemos um tipo que começa com a letra maiúscula, estamos trabalhando com um classe
        //A diferença: "" para string e '' para carctere - obrigatoriamente
        //Comporta qualquer qtd de caractere, mas o recomendado é 67 mil no máximo

        //String é a classe para se trabalhar com texto
        //Os textos devem ser escritos entre aspas duplas ""

        //Tres formas da String
        //Forma 1 - String com conteúdo
        String comConteudo = "Com Conteudo";
        //Forma 2 - String Vazia
        String semConteudo = "";
        //Forma 3 - String em branco;
        String emBranco = " "; //Tenha um espaço ou vários em branco
        //Tomar cuidado com o usuário, tratar erros de string vazia ou em branco para não ter erro


        //Problemas com String
        String data = "08/10/1988";
        String numeroInteiro = "10";
        String numeroDecimal = "77.99";
        String cpf = "456.482.068-01"; //Nesse caso ele deve ser uma string pois não podemos começar um numero inteiro com 0 e temos um caracter especial

        //Com char
        //String é uma coleção de caracteres(chars)
        char umChar = 35;
        System.out.println(umChar);  //Ele trz o caractere da referente da tabela

        char char1 = 'F';
        char char2 = 'i';
        char char3 = 'a';
        char char4 = 'p';

        String fiap = "" + char1 + char2 + char3 + char4;
        System.out.println(fiap);

        //Problema com String
        String numeroInteiroA = "10";
        String numeroInteiroB = "20";
        System.out.println(numeroInteiroA + numeroInteiroB);

        //Comparando Strings - NÃO UTILIZAR == - Se utilizar, ele não compara o conteudo, ele compara a memória
        //Java é 100% CASE SENSITIVE (ele faz a comparação de minúsculo e maiúsculo, ele faz isso pq estão em posições diferentes na tabela
        String comA = "Um texto";
        String comB = "um texto";
        System.out.println(comA.equals(comB));

        //Forma de burlar o Case Sensitive
        String tranformadaA = comA.toUpperCase();
        String tranformadaB = comB.toUpperCase();
        System.out.println(tranformadaA.equals(tranformadaB));

        //Qualquer classe que comece com letra maiúscula, precisamos comparar com equals


       //Alguns métodos de String
       String testando = "Testando um Texto / Bem-Vindo";

       //Verificando se uma String está vazia
       System.out.println(testando.isEmpty());

       //Verificando se uma String está em branco
       System.out.println(testando.isBlank());

       //Verificando se uma String tem um fragmento de texto
       System.out.println(testando.contains("Vindo"));

       //Verificando o Tamanho de uma String levando em conta os caracteres
       System.out.println(testando.length());

       //Verificando o primeiro caractere de uma String
       //A partir do java 21 nasceu o metodo .first()
       System.out.println(testando.charAt(0)); //A lógica funciona como o array, começamos do 0 por diante

       //Verificando o último caractere de uma String
       //A partir do java 21 nasceu o metodo .last()
       System.out.println(testando.charAt(testando.length()-1));

       //Verificando um intervalo de uma String
       System.out.println(testando.substring(0,4));

       //Deixando uma String com todos os caracteres em maiúsculo
       System.out.println(testando.toUpperCase());

       //Deixando uma String com todos os caracteres em minúsculo
       System.out.println(testando.toLowerCase());

       //Trabalhando com a emenda de texto
       String nome = "Joaquim";
       String sobrenome = "Silva";
       //Forma 1 - Concatenação - Somatória de textos +
       System.out.println(nome + " " + sobrenome);
       //Forma 2 - Interpolação - mét0do .format()
       //Os fragmentos de textos a serem inseridos devem ser indicados com o scape %s
       String formatada = String.format("Olá, meu nome é %s, e meu sobrenome é %s.", nome, sobrenome);
       System.out.println(formatada);

        //Trabalhando com blocos de textos - é a possibilidade de trabalhar com ums String com mais de uma linha
        //A partir do Java 15
        String blocoTexto = """
                Ó mar salgado, quanto do teu sal
                São lágrimas de Portugal!
                Por te cruzarmos, quantas mães choraram,
                Quantos filhos em vão rezaram!
                Quantas noivas ficaram por casar
                Para que fosses nosso, ó mar!
                """;
        System.out.println(blocoTexto);



    }
}