import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declaracion del objeto scanner para poder obtener informacion desde la consola
        Scanner scan = new Scanner(System.in);
        //creando un objeto de tipo ajuste ahorcado para obtener los metodos
        ajustesAhorcado  ahorcado = new ajustesAhorcado();

        //variable de tipo booleano que sirve como bandera para saber si se adivino la pabra
        boolean compleado = false;

        //algunos elementos que sirven como auxiliares
        String palabraNueva = "";

        //metodo que sive para la obtencion de una palabra random al alzar
        String palabraRandom = ahorcado.getPalabra();

        //metodo que sirve para la conversion de un string a un array de tipo char
        char palabraSeleccionada[] = new char[palabraRandom.length()];
        char textoEntrada = ' ';

        //metodo que sirve para mostrar la palabra random
        ahorcado.mostrarPalabra();

        /*
        * metodo para para transformar las palabras a caracteres "-" para que no sepa la palabra*/
        for (int i = 0; i < palabraSeleccionada.length; i++) {
            palabraSeleccionada[i] = '_';
            System.out.print(" " + palabraSeleccionada[i] + " ");
        }


        //este ciclo sirve para seguir preguntado hasta que se sepa la palabra adivinada
        while(!compleado){
            System.out.println("\n\nIntroduce solo una palabra (si introduces un texto se tomara como valido el primer caracter)");
            String textoEntradaEntero = scan.next();

            if(textoEntradaEntero.equals(palabraRandom)){
                mostrarTextoFelicidades();
                compleado = true;
            }else{
                textoEntrada = textoEntradaEntero.charAt(0);
            }



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
                mostrarTextoFelicidades();
                compleado = true;
            }

        }

    }

    public static void mostrarTextoFelicidades(){
        System.out.println("\n\n");
        System.out.println("\n\n[- - - - F E L I C I D A D E S - - - ]");
        System.out.println("\t\tHas adivinado la palabra");
        System.out.println("\n\n");
    }

}
