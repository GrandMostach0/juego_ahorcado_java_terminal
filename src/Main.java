import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ajustesAhorcado  ahorcado = new ajustesAhorcado(5);
        boolean compleado = false;
        String palabraRandom = ahorcado.getPalabra();
        char palabraSeleccionada[] = new char[palabraRandom.length()];

        ahorcado.mostrarPalabra();

        for (int i = 0; i < palabraSeleccionada.length; i++) {
            palabraSeleccionada[i] = '_';
            System.out.print(" " + palabraSeleccionada[i] + " ");
        }

        while(!compleado){
            System.out.println("\n\nIntroduce una letra");
            char textoEntrada = scan.next().charAt(0);

            for (int n = 0; n < palabraSeleccionada.length; n++){
                if( palabraRandom.charAt(n)== textoEntrada){
                    palabraSeleccionada[n] = textoEntrada;
                }
            }

            for (int i = 0; i < palabraSeleccionada.length; i++) {
                System.out.print(" " + palabraSeleccionada[i] + " ");
            }

            for(int k = 0; k < palabraSeleccionada.length; k++){
                if(palabraSeleccionada[k] != '_'){
                    compleado = true;
                }
            }
        }

    }
}
