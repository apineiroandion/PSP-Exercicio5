package ejercicio;

public class Ejecutor {
    /**
     * Metodo que ejecuta un comando
     * @param comando String con el comando a ejecutar
     */
    public static Integer ejecutarComando(String comando) {
        if (comando.equals("salir")) {
            System.out.println("Saliendo del programa...");
            System.exit(0);
        }else {
            try {
                Process proceso = Runtime.getRuntime().exec(comando);
                proceso.waitFor();
                return proceso.exitValue();

            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }
}
