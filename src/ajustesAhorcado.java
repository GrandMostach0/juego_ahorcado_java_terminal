import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ajustesAhorcado {

    //array de las palabras a agregar
    private String listaPalabras[] = {"gato", "perro", "pajaro", "vaca", "cabra", "becerro"};
    private int numVidas = 0;
    public ajustesAhorcado(int numeroVidas){
        this.numVidas = numeroVidas;
    }

    public void getPalabra(){
        int posicion = (int) (Math.random() * listaPalabras.length);
        System.out.println(listaPalabras[posicion]);
    }

}
