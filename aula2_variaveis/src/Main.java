
public class Main {
    public static void main(String[] args) {

        //Trabalhando com variáveis
        //Repositório de dados: Um local em memória com conteúdo e endereço
        //Criar um espaço de memoria para armazenar um dado

        var nome = "Gabrielly Candido";

        //Trabalhando com tipos Explícitops - Iniciamos com o tipo
        int idade = 50;
        String diaSemana = "Quarta";
        //Comecei declarando explicitamente qual o tipo de dado

        //Com inferência automática de tipos - Iniciamos com var
        //Só é possível a partir do java 11
        var Umtexto = "Um texto";
        var Kilometragem = 45;
        var altura = 1.85;
        //O entendimento da inferência automática de tipos é entendida pelas "", ele interpreta

        //Tipos primitivos de dados
        //Para armazenar números int
        byte numByte = 10; // É o menor tipo de dados que vamos armazenar números - armazena até 127
        short numShort = 1000; // Armaezena até 32.700
        int numInt= 10; //Armazena até 2 bilhoes
        long numLong= 10000; //Armaneza muuuuuuuitos números
        //Armazenar float
        float decFloat = 10.90495f; //Precisa usar o F no sinal
        double decDouble = 20.00000; //Armazena o dobro, pode ter até 15 casas decimais -- O uso do d é opcional
        boolean verdFalso = true; //True/False
        char carctere = 'i'; //Ele serve para aramazenar caracteres - precisa colocar entre aspas simples // Só armazena um caractere


        //Como as variáveis funcionam?
        //Variáveis são mutáveis!

        var nomeb = "Renata Joaquina";
        System.out.println(nomeb);

        nomeb = "Renata das couves";
        System.out.println(nomeb);

        //Criando variáveis fináis - Não podem ser modificadas
        final int anoIndependencia = 1822; //Apenas colocamos a palavra final na frente, não será possível a modificação

        //Alternativas para "modificar" uma final
        int novoAno = anoIndependencia;
        System.out.println(novoAno);

        novoAno = 1823;
        System.out.println(novoAno);

        //Trabalhando com valores nulos - null: serve para indicar valores nulos
        String numDocumento = null; //Podemos alterar mais pra frente o valor, enquanto ainda não sabemos
        //Se printar, ele traz null
        //Tomar cuidado para esse null não quebrar a aplicação, quando acontece, ele estava esperando um determinado valor e não chegou
        //O vazio não conta como nulo


        //Coding Style - Java - CamelCase
        String primeiroNome = "Antonio";  //Quando damos o nome da var, precisamos separar o nome das palavras com a segunda palavra maiuscula

        //Variáveis: lowerCameCase
        //Funções/Métodos: lowerCameCase
        //Classes e Afins: UpperCamelCase
        //Elementos de um Enum: NOME_DO_ELEMENTO - UPPERCASED_PASCAL_CASE

        //Geralmente codamos da mesma forma com que a linguagem é escrita
        //No canto esquerdo, temos a External Libraries


        //Uma breve introdução aos Wrappes
        Integer numeroInteriro = 10;
        Float numeroDecimal = 1888f;


        //https://www.w3schools.com/java/java_data_types.asp

        }
    }
