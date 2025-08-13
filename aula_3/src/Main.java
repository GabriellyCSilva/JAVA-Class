public class Main {
    public static void main(String[] args) {
        //Atribuindo valores - Operador =
        var dado = 10; //Ele sempre vai aparecer antes
        dado = 11;
        dado = 12;

        //Operadores Matemáticos + - *
        var som = 10 + 10;
        var sub = 20 - 10;
        var mul = 3 * 3;
        var div = 30 / 10; //A divisão por 0 da erro pois ela não existe, isso faz com que quebre a aplicação

        //Atribuindo e Operando Simultaneamente - Operadores +=
        var valorA = 10;

        valorA = valorA + 10;
        System.out.println(valorA);

        valorA += 10; // Uma forma de simplicar a conta, podemos fazer isso com outros operadores também
        System.out.println(valorA);

        //Incremento e Decremento - Operadores ++ -- // Sempre que vemos essas palavras, ou ele vai somando de um em um ou subtraindo de um em um
        var valorB = 20;
        valorB = valorB + 1;

        //Forma mais simplificada
        valorB ++;
        System.out.println(valorB);

        valorB --;
        System.out.println(valorB);


        //Trocar Highlight para Syntax para não ficar como "erro" as palavras em português

        //Comparação - Operadores ==  !=  >  <  >=  <=
        //Elas são validas apenas para dados primitivos
        //O resultado desse tipo de operação sempre será uma expressão booleana
        var compA = 10;
        var compB = 11;

        System.out.println(compA == compB); //Igualdade
        System.out.println(compA != compB); //Diferente
        System.out.println(compA < compB); //Menor que
        System.out.println(compA > compB); //Maior que
        System.out.println(compA <= compB); //Menor ou igual que
        System.out.println(compA >= compB); //Maior ou igual que

        //Classificação dos Operadores
        var unario = 10; //Unário: age apenas em um valor - age de um lado só do valor
        var binario = 10 + 10; //Binario: age entre dois valores
        //Trabalha com a decomposição de 3 etapas
        var ternario = (10 > 9) ? "Dez é maior" : "Dez é menor"; // Uma expressão, o valor se for verdadeira, o valor se for falsa - operaador elvis
        System.out.println(ternario);

        //Exercicio  - Desenvolva um algoritimo utilizando apenas operadores unarios, binarios e ternarios, onde seja verificado se uma determinada idade está apta para tirar habilitação
        var anoNascimento = 2005;
        var anoAtual = 2025;
        var idade = anoAtual - anoNascimento;
        var ternarioex = (idade >= 18) ? "O usuário tem idade para tirar habilitação" : "O usuário não tem idade para tirar habilitação";
        System.out.println(ternarioex);

        //Operadores Lógicos: AND && OR || NOT - !
        System.out.println('a' == 'a' && 10 > 11); // AND &&
        System.out.println('a' == 'a' || 10 > 11); // OR ||
        System.out.println(!('a' == 'a')); // NOT - !






    }
}
