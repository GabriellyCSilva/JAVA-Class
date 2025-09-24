package models;


//Posso encadear quantas propriedades genéricas que eu quiser, basta separar por ,
public class Coordenadas<x, y> {

    //Propriedades
    private x coordx;
    private y coordy;

    //Construtor
    public Coordenadas(x coordx, y coordy) {
        this.coordx = coordx;
        this.coordy = coordy;
    }

    //Métod0
    public void imprimirCoordenadas(){
        System.out.println("Coordenada X: " + coordx);
        System.out.println("Coordenada Y: " + coordy);
    }

}
