
public class Main {
    public static void main(String[] args) {
        //Trabalhando com blocos
        //Parênteses () - Tupla/Conjunto de dados
        //Chaves {} - Bloco de execução - escopo
        //Colchetes [] - Indicação de coleção
        //Diamante <> - Tipos genéricos
        //Toda sentença precisa terminar com ;

        //Expressões Booleanas - Te diz se é verdadeiro ou falso
        boolean lighIsOn = true;

        //Simples - Verificar o próprio boolean, printando ele verifica
        System.out.println(lighIsOn);
        //System.out.println(lighIsOn); //Fazer isso funciona mas está redundante, não precisa

        //Média- Utilizamos os operadores de comparação
        System.out.println(10 > 9);

        //Complexa - Utilizamos operadores lógicos
        System.out.println(10 > 9 && lighIsOn);

        //Quanto maior a expressão booleana, mais complexa ela fica

        //A Sintaxe do if
        //Sintaxe: if(expressão booleana){instruções a serem executadas}
        //Dentro dos parenteses podemos colocar um conjunto de dados, no caso do if, vai uma expressão booleana
        //As chaves trazem o bloco de execução - dentro do bloco colocamos as instruções a serem executadas
        if(lighIsOn){
            System.out.println("A luz está ligada");
        }
        //Não precisa necessáriamente colocar um else
        //Caso não coloque a outra condição, ele pula o if e segue o código

        //A Sintaxe do else
        //O else vem sempre depois de um if
        //Sintaxe: else{Instruções a serem executadas}
        else{
            System.out.println("A luz está apagada");
        }
        //Código completo
        if(8 > 9){
            System.out.println("É maior");
        }
        else {
            System.out.println("É menor");
        }

        //Trabalhando com expressões complexas
        //Quando trabalhamos com expressões complexas, precisamos validar duas expressões
        String user = "Admin";
        String password = "1234";

        if (user.equals("FiapUser") && password.equals("Fiap1234")){
            System.out.println("Login efetuado com sucesso");
        }
        else {
            System.out.println("Erro ao efetuar o login");
        }

        //Operador OR ||
        boolean credito = true;
        boolean debito = false;

        if (credito || debito){
            System.out.println("Pagamento efetuado com sucesso");

        }
        else {
            System.out.println("Erro ao processar pagamento.");
        }

        //Trabalhando com o operador NOT !
        String textField = "Joaquim da Silva";
        if (!textField.isEmpty()){
            System.out.println(String.format("Nome encontrado: %s ", textField)); //Para dar certo, precisa colocar um String.format
        }
        else {
            System.out.println("Preencha o campo corretamente");
        }

        //Tralahando com if / else if / else
        String semaforo = "Amarelo";

        if (semaforo.equals("Vermelho")){
            System.out.println("Pare");
        }
        else if (semaforo.equals("Amarelo")){ //No else if precisa passar o parametro novamente - Compensa apenas até 3x, passou disso melhor usar o case
            System.out.println("Atenção");
        }
        else { //Pode deixar só o else fi, sem terminar
            System.out.println("Siga");
        }

        //Trabalhando com switch/case
        //Pega uma variavel, decompoe e para cada resultado determina uma ação

        int diaSemana = 1;

        switch (diaSemana){
            case 1:
                System.out.println("Domingo"); //Precisamos colocar um break para parar o código caso chegue no resultado
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            //Caso não seja o coberto por nenhum case, teremos o default
            default:
                System.out.println("Dia da semana não encontrado"); //default não precisa de break
        }

        //Trabalhando com operanor ternário - Operador Elvis ?:
        //Qualquer if else pode ser substituido por um operador ternario caso seja só um if else
        int horario = 10;

        String resultado = (horario < 18) ? "Que dia lindo!" : "Que noite linda!";
        System.out.println(resultado);

        //Existem duas formas de colecionar em java básica

        //Arrays Primitivos - São rápidos, mas são limitados, não consigo aumentar ou diminuir os dados e só pode ter um tipo de dado
        //Para indicar que é um arry, coloca um [] na frente
        //Dica: T0do array de java tem indice de base 0
         int[] numParesUmDigito = {2,4,6,8};

         String[] frutasComM = {
                 "Melancia", //0
                 "Maça", //1
                 "Melão", //...
                 "Mamão",
                 "Marmelo"
         };

         //Imprimindo um elemente de um array primitivo
        System.out.println(frutasComM[0]);
        //Qualquer aplicação que tente acessar um indice de aray que não exista, ela quebra

        //Tentando imprimir um array inteiro
        //Por enquanto é exibido apenas o endereço de memória
        System.out.println(frutasComM);

        //Listas - São menos performáticas, ou seja, mais lentas, mas extremamente cheias de recursos


    }
}