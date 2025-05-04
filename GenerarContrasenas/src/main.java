import java.security.SecureRandom;
import java.util.Scanner;

public class main {

    // Caracteres que se utilizarán para generar la contraseña
    private static final String LETRAS_MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String LETRAS_MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMEROS = "0123456789";
    private static final String SIMBOLOS = "!@#$%^&*()-_=+[]{}|;:,.<>?";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longitud;
        boolean incluirMayusculas, incluirNumeros, incluirSimbolos;

        // Solicitar longitud de contraseña
        do {
            System.out.print("Ingrese la longitud de la contraseña (entre 8 y 16): ");
            longitud = scanner.nextInt();
        } while (longitud < 8 || longitud > 16);

        // Configuración de los parámetros
        System.out.print("¿Incluir letras mayúsculas? (true/false): ");
        incluirMayusculas = scanner.nextBoolean();

        System.out.print("¿Incluir números? (true/false): ");
        incluirNumeros = scanner.nextBoolean();

        System.out.print("¿Incluir símbolos? (true/false): ");
        incluirSimbolos = scanner.nextBoolean();

        String contrasena = generarContrasena(longitud, incluirMayusculas, incluirNumeros, incluirSimbolos);
        System.out.println("Contraseña generada: " + contrasena);
        scanner.close();
    }

    public static String generarContrasena(int longitud, boolean incluirMayusculas, boolean incluirNumeros, boolean incluirSimbolos) {
        StringBuilder conjuntoDeCaracteres = new StringBuilder(LETRAS_MINUSCULAS);

        if (incluirMayusculas) {
            conjuntoDeCaracteres.append(LETRAS_MAYUSCULAS);
        }
        if (incluirNumeros) {
            conjuntoDeCaracteres.append(NUMEROS);
        }
        if (incluirSimbolos) {
            conjuntoDeCaracteres.append(SIMBOLOS);
        }

        SecureRandom random = new SecureRandom();
        StringBuilder contrasenaGenerada = new StringBuilder(longitud);

        for (int i = 0; i < longitud; i++) {
            int indiceAleatorio = random.nextInt(conjuntoDeCaracteres.length());
            contrasenaGenerada.append(conjuntoDeCaracteres.charAt(indiceAleatorio));
        }

        return contrasenaGenerada.toString();
    }
}
