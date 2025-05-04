import java.util.Random;
import java.util.Scanner;

public class main { // cambia el nombre de la clase a "Main" con M mayúscula
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int premio = random.nextInt(10000);
        // Generar un número de lotería aleatorio de 3 dígitos
        int lotteryNumber = random.nextInt(900) + 100; // Entre 100 y 999
        System.out.println("Número de lotería generado: " + lotteryNumber);

        // Solicitar al usuario que ingrese su número de 3 dígitos
        System.out.print("Ingrese un número de 3 dígitos: ");
        int userNumber = scanner.nextInt();

        // Convertir ambos números a cadenas para facilitar la comparación
        String lotteryStr = String.valueOf(lotteryNumber);
        String userStr = String.valueOf(userNumber);

        // Contadores para aciertos
        int correctPositionCount = 0;

        // Comparar dígitos en la misma posición
        for (int i = 0; i < 3; i++) {
            if (userStr.charAt(i) == lotteryStr.charAt(i)) {
                correctPositionCount++;
            }
        }

        double premioganado = 0;
        // Determinar ganancia basada en los aciertos
        switch (correctPositionCount) {
            case 3:
                System.out.printf("¡Felicidades! Ganaste el 100%%: %.2f €\n", (double) premio);
                break;
            case 2:
                premioganado = 0.5 * premio; // 50%
                System.out.printf("Ganaste el 50%% que son: %.2f €\n", premioganado);
                break;
            case 1:
                premioganado = 0.2 * premio; // 20%
                System.out.printf("Ganaste el 20%% que son: %.2f €\n", premioganado);
                break;
            default:
                System.out.println("No ganaste esta vez.");
                break;
        }

        scanner.close();
    }
}
