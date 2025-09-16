//Bug- ele não quebra a aplicação, ele coexiste com ela
//Crash quebra a aplicação

public class Main {
    public static void main(String[] args) {

        //Provocando Exceptions
        String[] frutas = {"Maça", "Banana", "Mamão"};

        //Não podemos chamar isso de erro, isso é exceção

        //1 Exceptions - tentando acessar algo que não tem na string
        //System.out.printf(frutas[3]);

        //2 Exceptions - Divisão por zero não existe
        //int divsao =  10/0;

        //3 Exception - Tentando imprimir uma string nula deixando as letras todas maiúscula
        String nula = null;
        //System.out.printf(nula.toUpperCase());

        //Java é pré-compilado, ou seja, enquanto eu escrevo, ele já vai tentando "entender"
        //A jvm consegue prever o erro, já o exception não

        //Erros são apontados com defeitos de sintaxe, e sempre são apresentados na pré-compilação

        //Exemplo de erros:

        //Incompatibilidade de tipos
        String umTexto = "Um texto";
        //umTexto = 10;

        //Declarações não resolvidas
        //System.out.printf(pipoca);


        //Existem 3 forma de contornar uma exception

        //Forma 1 - Providenciar o que é necessário para não quebrar
        umTexto = "Outro Texto";
        System.out.println(frutas[2]); // Não podemos fazer igual python de colocar um índice -1, para isso, precisamos usar o array

        //Forma 2 - Trabalhar com testes automatizados (Pirâmide de teste, podemos criar robos para testar o código)

        //Forma 3 - Estrutura try/catch
        //O catch faz o capturamento do erro

        //O try sempre precisa vir acompanhado do catch
        try{
            //Se faz a tentativa de executar alguma instrução
            System.out.println(frutas[3]); //Ele tenta executar, se ele não consegui executar ele para nessa linha e não imprimi o "foi"
            System.out.println("Foi!");
        }
        catch (ArrayIndexOutOfBoundsException umaExcep){
            System.out.println("Erro ao executar o código:");
            System.out.println(umaExcep); //Ele não consegue imprimir uma exception no f
        }


        try{
            umTexto = null;
            System.out.println(umTexto.toUpperCase());
            System.out.println("Foi!");
        }
        catch (NullPointerException umaExcep){ //Não tem problema coloca o mesmo nome, a tupla só serve para execução do bloco que ela está
            System.out.println("Erro ao executar o código");
            System.out.println(umaExcep);
        }

        //Crindo estrutura try/catch para captar qualquer exception
        //É melhor fazer um try para cada exception pq ele não consegue ler todas e para na primeria
        try{
            System.out.println(frutas[0]);
            int div = 84/0;
            umTexto = null;
            System.out.println(umTexto.toUpperCase());
            System.out.println("Foi!");
        }
        catch (Exception umaExep){
            System.out.println("Erro ao executar o código");
            System.out.println(umaExep);
        }

        //Trabalhando com o bloco finally
        try{
            int div = 76/0;
            System.out.println("Foi!");
        }
        catch (Exception umaExcep){
            System.out.println("Não foi");
        }
        //O finally sempre será executado, independente se der certo ou não
        finally {
            System.out.println("Chegou no final da execução");
        }




    }
}

