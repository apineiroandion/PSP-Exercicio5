import ejercicio.Ejecutor;
import ejercicio.Interfaz;

public class Main {
    public static void main(String[] args) {
        bucleEjecucion();
    }
    /**
     * Metodo que pasa el comando a la clase Ejecutor a traves de un proceso
     * @param comando String con el comando a ejecutar
     */
    public static void ejecutarComando(String comando) {
        Integer resultado = Ejecutor.ejecutarComando(comando);
        Interfaz.mostrarResultado(resultado);
    }
    /**
     * Metodo que crea un bucle de ejecucion
     */
    public static void bucleEjecucion() {
        while (true) {
            ejecutarComando(Interfaz.pedirComando());
        }
    }
}
