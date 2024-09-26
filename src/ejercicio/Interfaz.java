package ejercicio;

import java.util.Scanner;

public class Interfaz {
    /**
     * Scanner para guardar los comandos a modo de String
     */
    static Scanner scanner = new Scanner(System.in);

    /**
     * Metodo que pide un comando por consola
     * @return String con el comando introducido
     */
    public static String pedirComando() {
        String comando = "";
        System.out.print("Introduce un comando o 'salir' para terminar: ");
        comando = scanner.nextLine();
        return comando;
    }
    //TODO: Implementar el metodo mostrarResultado null si no se ha ejecutado ningun comando o el valor de salida del comando

}
