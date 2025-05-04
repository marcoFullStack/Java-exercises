import java.util.Scanner;

public class FibonacciRecursivo {

    // Método recursivo para calcular el n-ésimo número de Fibonacci
    public static long fibonacci(int n) {
        if (n == 0) {
            return 0; // N1
        } else if (n == 1) {
            return 1; // N2
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // NN-3
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pidiendo al usuario cuántos números de Fibonacci quiere
        System.out.print("¿Cuántos números de Fibonacci quieres obtener? ");
        int cantidad = scanner.nextInt();

        // Validar la cantidad
        if (cantidad < 0) {
            System.out.println("Por favor ingresa un número entero no negativo.");
        } else {
            System.out.println("Serie de Fibonacci:");
            for (int i = 0; i < cantidad; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }

        scanner.close();
    }
}
