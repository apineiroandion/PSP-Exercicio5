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
    /**
     * Metodo que muestra el resultado de la ejecucion del comando
     * @param resultado Integer con el resultado de la ejecucion del comando
     */
    public static void mostrarResultado(Integer resultado) {
        if (resultado == null) {
            System.out.println("No se ha ejecutado ningun comando");
        } else {
            System.out.println("El comando ha devuelto el valor: " + resultado);
        }
    }
}
