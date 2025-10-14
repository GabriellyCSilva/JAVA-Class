import org.w3c.dom.Text;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JanelaSomarDoisValores {

    public static void main(String[] args) {
        //Nossa aplicação pode ter mais de um mét0do de entrada (um main)
        //DONE: Criar janela
        //Elemento Frame - A nossa Janela
        Frame frame = new Frame("Soma de dois valores");
        frame.setSize(600, 300); //Definindo tamanho da janela

        //Para escolhermos onde vamos colocar a janela
        Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (tamanhoTela.width - frame.getWidth()) / 2; //pego o tamanho da minha tela e divido por 2, assim ela fic centralizada
        int y = (tamanhoTela.height - frame.getHeight()) / 2;
        frame.setLocation(x, y);

        //Indicando função do botão fechar
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //Definindo que a janela terá layout com subdivisões
        frame.setLayout(new GridBagLayout());

        //Criando um Painel para centralizar os componentes
        Panel painelCentralizado = new Panel(new FlowLayout(FlowLayout.CENTER));


        //DONE: Criar Elementos de interface
        Label labelValorA = new Label("Valor A:");
        Label labelValorB = new Label("Valor B:");
        Label labelresultado = new Label("Resultado:");

        TextField campoValorA = new TextField(5);
        TextField campoValorB = new TextField(5);
        TextField resultado = new TextField(5);
        resultado.setEditable(false);

        Button botaoSomar = new Button("Somar");
        Button botaoSLimpar = new Button("Limpar");

        //Adicionando componentes
        frame.add(painelCentralizado);

        painelCentralizado.add(labelValorA);
        painelCentralizado.add(campoValorA);
        painelCentralizado.add(labelValorB);
        painelCentralizado.add(campoValorB);
        painelCentralizado.add(botaoSomar);
        painelCentralizado.add(labelresultado);
        painelCentralizado.add(resultado);
        painelCentralizado.add(botaoSLimpar);

        //Listener para o botão somar
        botaoSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //para não quebrar a aplicação, precisamos colocar um try para tratar o erro caso o usuario passe um texto
                try{
                    double valorA = Double.parseDouble(campoValorA.getText());
                    double valorB = Double.parseDouble(campoValorB.getText());
                    double soma = valorA + valorB;
                    resultado.setText(String.valueOf(soma));
                }
                catch (NumberFormatException exception){
                    System.out.println(exception);
                    resultado.setText("Erro!");
                }
            }
        });

        //Listener do botão limpar
        botaoSLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                campoValorA.setText("");
                campoValorB.setText("");
                resultado.setText("");
            }
        });

        //Exibindo Janela
        frame.setVisible(true);
    }
}
