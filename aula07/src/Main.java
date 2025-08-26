//Programação de orientada a objeto
//Pegamos um objeto da vida real e colocamos na programação
//O molde que "molda" a garrafa, chamamos de classe, consigo fazer muitas garrafas com o molde
//Classe: é o molde
//Pode ser um objeto físico, uma pessoa e etc
//Pilares fundamentais
//Abstração - focar nos aspectos importantes de um objeto e ignorar os aspectos irrelevantes
//Encapsulamento - É o principio de esconder detalhes do objeto e expor apenas umas interface para interagir com ele - exemplo do banco, filtro quem pode ver as infos
//Herança - Permite que uma classe herde atributos e métodos de outra classe
//Polimorfismo- Capacidade de objetos de uma mesma classe responderem de maneiras diferentes aos mesmos métodos - "Posso acelerar de formas diferentes, muda a capacidade, mas ele fará a mesma coisa"


//Classes - Molde - Script que crio para falar que o objeto daquele molde terá aquelas caracteristicas
//Objeto - É o que eu tiro da classe


public class Main { //É o nosso executável
    public static void main(String[] args) {

        //Criando objetos da classe carro
        Carro carroA = new Carro();

        //Preenchendo as propriedades de carroA
        carroA.cor = "Azul";
        carroA.fabricante = "VW";
        carroA.modelo = "Fusca";
        carroA.preco = 80.000f;
        carroA.kilometragem = 100000;

        //Utilizando os métodos
        carroA.acelerar();
        carroA.frear();

}}

//Botao direito no scr -  new - escolhe o tipo
//Todas as classes em java precisam começar com a letra maiuscula

