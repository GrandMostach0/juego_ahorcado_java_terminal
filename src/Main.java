import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ajustesAhorcado  ahorcado = new ajustesAhorcado(5);
        char palabraSeleccionada[] = new char[ahorcado.getPalabra().length()];

        ahorcado.mostrarPalabra();

        for(int i = 0; i < palabraSeleccionada.length; i++){
            System.out.print(" _ ");
        }

        System.out.println("\n\nIntroduce una palabra");
        String textoEntrada = scan.next();

    }
}
