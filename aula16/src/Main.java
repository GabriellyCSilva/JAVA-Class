
//Frameworks
//É o processo de aceleração da produção de código, ajuda a criar coisas baseada em outras que ja estão prontas, acelerando o processo
//Vantagens- Quando usamos, conseguimos agilizar o trabalho e um código mais limpo, garantindo mais clareza em tudo que é implementado pela ferramenta
//Porém, ele gera dependencias no código, por isso, precisamos lembrar que: não podemos ignorar que o objeto gerador das dependências não está no código do projeto, pode ser uma dificuldade caso não consia fornecer as dependencias diretamente no código teste, ele primeiro resolve todas as dependencias antes de subir a aplicação e conforme as dependecias são inseridas, muias configurações são baixadas sem necessidade

//Aclopamento é qundo eu crio um objeto e inicializo ele no main, porém isso limita o uso, ele fica apenas no main
//O aclopamento faz ocupar espaço em memória sem utilizar,

//Conjunto original de ferramenta da linguagem java, para criar interfaces gráficas e gerenciar componentes de janelas
//Fica na External Libraries até importar
import java.awt.*;

public class Main {
    //Criando o requadto da janela
    //static Frame frame = new Frame("Janela Básica"); //o static serve para podermos utilizar dentro da própria classe

    //Criando uma caixa de texto
    //static Label label = new Label("Hello World");

    //Para não ocupar espaço em memória, fazemos assim:
    static Frame frame;
    static Label label;

    //Utilizando o construtor para injetar as dependencias de Frame e Label
    public Main(Frame frame, Label label) {
        this.frame = frame;
        this.label = label;
    }

    public static void main(String[] args) {

        frame = new Frame();
        label = new Label("Olá AWT");

        //Criando o requadto da janela
        //Frame frame = new Frame("Janela Básica");

        //Definindo o tamanho da janela em pontos
        frame.setSize(300,300);

        //Definindo o alinhamento do texto
        label.setAlignment(Label.CENTER);

        //Adicionando o texto na janela
        frame.add(label);

        //Apresentando a janela
        frame.setVisible(true);

        
    }
}