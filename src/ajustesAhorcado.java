import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ajustesAhorcado {

    //array de las palabras a agregar
    private String listaPalabras[] = {"gato", "perro", "pajaro", "vaca", "cabra", "becerro"};
    private char palabraSelccionada[];
    String palabraElejida = "No se ha seleccionado ninguno";

    public String getPalabra(){
        int posicion = (int) (Math.random() * listaPalabras.length);
        palabraElejida = listaPalabras[posicion];
        return palabraElejida;
    }

    public void mostrarPalabra(){
        System.out.println(palabraElejida);
    }

}
