//Linha de comentário
/*
Comentario de múltiplas linhas
*/

//Para abrir um JavaDoc
/**
 * Esse é um comentário JavaDoc
 * @author Gabrielly
 * @since 10/2025
 * @see main
 * Aceitas tags HTML
 * <h3>Aceita</h3>
 * <p>Serve para documentar seus códigos</p>
 * <p>Pode ser visualizado formatado</p>
 * <p>Tem a capacidade de exportar toda a documentação em HTML</p>
 */

public class Calculos {

    private int quantidadeItens;

    public Calculos(int quantidadeItens){
        this.quantidadeItens = quantidadeItens;
    }

    public int acrescentarItem(){
        return quantidadeItens ++;
    }

    public  int removerItem() {
        return quantidadeItens --;
    }

    //Manter o Ctrl e apertar no string ele mostra as informações
    @Override
    public String toString() {
        return "Calculos{" +
                "quantidades =" + quantidadeItens +
                "}";
    }
}
