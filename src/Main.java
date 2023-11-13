import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ajustesAhorcado  ahorcado = new ajustesAhorcado();
        boolean compleado = false;
        String palabraNueva = "";
        String palabraRandom = ahorcado.getPalabra();
        char palabraSeleccionada[] = new char[palabraRandom.length()];

        ahorcado.mostrarPalabra();

        for (int i = 0; i < palabraSeleccionada.length; i++) {
            palabraSeleccionada[i] = '_';
            System.out.print(" " + palabraSeleccionada[i] + " ");
        }

        while(!compleado){
            System.out.println("\n\nIntroduce solo una palabra (si colocas un texto se tomara como valido el primer caracter)");
            char textoEntrada = scan.next().charAt(0);

            for (int n = 0; n < palabraSeleccionada.length; n++){
                if( palabraRandom.charAt(n)== textoEntrada){
                    palabraSeleccionada[n] = textoEntrada;
                }
            }

            palabraNueva = "";

            for (int i = 0; i < palabraSeleccionada.length; i++) {
                palabraNueva += palabraSeleccionada[i];
                System.out.print(" " + palabraSeleccionada[i] + " ");
            }


            if(palabraNueva.equals(palabraRandom)){
                System.out.println("\n\n");
                System.out.println("\n\n[- - - - F E L I C I D A D E S - - - ]");
                System.out.println("\t\tHas adivinado la palabra");
                System.out.println("\n\n");
                compleado = true;
            }

        }

    }
}
