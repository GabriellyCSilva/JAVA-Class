public class Main {

    //A função é o executável de um app JAVA
    public static void main(String[] args) {

        //A função println serve para exibir elementos via console
        //System.out.println("Um texto");
        //primeiraFuncao();
        //somar15mais15();
        //somarDoisValores(2,3); //Posso passar vários um em seguida do outro
        String nomeCompleto = identificarPessoa("Gabrielly", "Silva");
        System.out.println(nomeCompleto);

        //Diferença entre parametro e argumento - Importante
        //No moemnto em que preenchemos uma função, passamos argumentos
        //Precisamos passar os argumentos da mesma forma que pedimos na função
        //Pedi o parametro
        //Dei o argumento do parametro pedido

    }
    //Para criamos outra função, precisamos sair da classe main

    //Criando uma primeira função

    //Sintaxe: modificador retorno nome (parâmetros) {instruções a serem executadas}
                //opcional obg.    obg.               obg.
    //Nomes de funções devem seguir o lowerCameCase
    //Uma função é um bloco de comando que se repete, é um script de algumas instruções que podem ser utilizadas repetidas vezes
    //Para se utilizar uma função, ela deve ser invocada
    static void primeiraFuncao(){
        System.out.println("Ola funções");
    }

    //O modificador static - torna uma função acessivel dentro da própria classe
    static void somar15mais15 (){
        System.out.println(15 + 15);
    }

    //Trabalhando com parametros
    //Parametros são dados pedidos pela função que devem ser argumentados durante a invocação
    static void somarDoisValores (int valorA, int valorB){ //posso colocar na tupla de dados quantos parametros eu quiser
        System.out.println("A somatória dos valores indicados é:");
        System.out.println(valorA + valorB);
    }

    //Trabalhando com retornos
    //Nos dá a possibilidade de guardar valores de uma função em repositórios
    static String identificarPessoa(String nome, String sobrenome){

        String nomeCompleto = nome + " " + sobrenome;

        return nomeCompleto; //Não faz sentido usar return se ao precisar armazenar o dado
    }

    //Trabalhando com Sobrecarga de Funções
    //Sobrecarga é a habilidade de funções terem o mesmo nome mas processarem dados de tipo diferentes
    static float subtrairDoisValores(float valorA, float valorB){
        float resultado = valorA - valorB;
        return resultado;
    }

    static int subtrairDoisValores(int valorA, int valorB){
        int resultado = valorA - valorB;
        return resultado;
    }









}



