package models;

/**
 * <h4>Classe para modelagem de duas oprações de calculo</h4>
 * <p>Posiibilidade de somar dois valores;</p>
 * <p>Possibilidade de subtrair dois valores;</p>
 * @author Gabrielly
 * @version 1.0
 * @since out 2025
 */

public class Calc {

    /**
     *<p>Utilizar o construtor ou o setValorA para preencher o valor A com um número inteiro </p>
     * <p>Preencher o valor b com um número inteiro</p>
     */

    private int valorA;
    private int valorB;

    /**
     * Mét0do construdor para criação de objetos Cacl
     * @param valorA - preencher com um dos valores inteiros a serem operados
     * @param valorB - preencher com um dos valores inteiros a serem operados
     */

    public Calc(int valorA, int valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }


    /**
     * Mét0do para realizar get valor A
     * @return retornará o valor especificado do atributo valor A
     */
    public int getValorA() {
        return valorA;
    }

    /**
     * @param valorA Preencher com um novo valor inteiro
     */
    public void setValorA(int valorA) {
        this.valorA = valorA;
    }

    /**
     * Mét0do para realizar get valor B
     * @return retornará o valor especificado do atributo valor B
     */
    public int getValorB() {
        return valorB;
    }

    /**
     * @param valorB Preencher com um novo valor inteiro
     */
    public void setValorB(int valorB) {
        this.valorB = valorB;
    }

    /**
     * Sobrescrita do mét0do toString()
     * @see Object classe de origem mét0do
     * @see String objeto de texto
     * @return uma formatação para visulaizar todos os dados classe como String
     */

    @Override
    public String toString() {
        return "Calc{" +
                "valorA=" + valorA +
                ", valorB=" + valorB +
                '}';
    }

    /**
     * Mét0do para somar os dois valores indicados nas propriedades
     * @return somatória de valorA e valor B
     */
    public int somarDoisValores(){
        return valorA + valorB;
    }

    /**
     * Mét0do para subtrair os dois valores indicados nas propriedades
     * @return subtração de valorA e valor B
     */
    public int subtrairDoisValores(){
        return valorA - valorB;
    }

    /**
     * Mét0do para identificar o usuário dos cálculos
     * @param nome indicar o nome em formato String a ser utilizado
     * @see String tipo a ser utilizado
     */
    public void identificarUsuario(String nome){
        System.out.println("Olá " + nome + "bem-vinda a nossa calculadora");
    }
}
