import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Podemos alterar o nome pelo arquivo e pelo proprio nome, precisamos apertar no botão direito e selecionar rename
public class JanelaHello {
    public static void main(String[] args) {

        //DONE: Criar janela
        //Elemento Frame - A nossa Janela
        Frame frame = new Frame("Trabalhando com Frames e Labels");
        frame.setSize(800, 600); //Definindo tamanho da janela

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

        //DONE: Criar Elementos de interface
        Label label = new Label("bem-vindo ao AWT!");
        label.setAlignment(Label.CENTER);
        frame.add(label);



        //Exibindo janela
        frame.setVisible(true);


    }
}