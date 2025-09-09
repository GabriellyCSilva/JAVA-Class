import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Tipos Primitivos
        //Vantagem: Performance maior
        //Desvantagem: Baixo poder de modificação e manipulação
        byte valorByte = 10;
        short valorShort = 100;
        int valorInt = 10000;
        long valorLong = 1000000;
        float valorFloat = 10.5f;
        double valorDouble = 11.555d;
        boolean valorBool = true;
        char valorChar = 'A';

        //Trabalhando com Wrappers
        //Vantagem: Alto poder de modificação e manipulação
        //Desvantagem: Performance menor
        Byte wrapByte = 10;
        Short wrapShort = 100;
        Integer wrapInt = 10000;
        Long wrapLong = 1000000L; //L é obrigatório
        Float wrapFloat = 10.5f; //f é obrig
        Double wrapDouble = 18.555d;
        Boolean wrapBool = true;
        Character wrapChar = 'T';

        //Onde Utilizar Wrappers?
        //- Array de java.util só podem utilizar objetos
        ArrayList<Integer> umArray = new ArrayList();

        //- Para fazer parses de dados em String
        //ALERTA!!! A formatação da string deve estar de
        // acordo com o tipo desejado
        Byte byteFromString = Byte.parseByte("10");
        Short shortFromString = Short.parseShort("100");
        Integer intFromString = Integer.parseInt("10000");
        Long longFromString = Long.parseLong("1000000");
        Float floatFromString = Float.parseFloat("10.89");
        Double doubleFromString = Double.parseDouble("88.66");
        Boolean boolFromString = Boolean.parseBoolean("werkjhkqwrej");
        System.out.println(boolFromString);

        //- Criando objetos a partir de valores primitivos
        Byte byteFromByte = Byte.valueOf(valorByte);
        Short shortFromShort = Short.valueOf(valorShort);
        Integer intergerFromInt = Integer.valueOf(valorInt);
        Long longFromLong = Long.valueOf(valorLong);
        Float floatFromFloat = Float.valueOf(valorFloat);
        Double doubleFromDouble = Double.valueOf(valorDouble);
        Boolean boolFromBool = Boolean.valueOf(valorBool);
        Character characterFromChar = Character.valueOf(valorChar);


        //Type Casting - Mudança de tipos de dados
        //Widening Casting - Automatica - Menor para o maior
        byte numParaCast = 40;
        short novoNumShort = numParaCast;
        int novoInt = novoNumShort;
        long novoNumLong = novoInt;
        float novoNumFloat = novoNumLong;
        double novoNumDouble = novoNumFloat;

        //Narrowing Casting - Manual - Maior para o menor
        //Alerta: Quando esse tipo de casting é feito perdemos as informações
        float floatParaCasting = 18.55f;
        int numModificado = (int) floatParaCasting;



    }}