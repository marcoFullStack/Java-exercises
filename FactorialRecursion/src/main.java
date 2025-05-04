public class main {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;  // Caso base
        } else {
            return n * factorial(n - 1);  // Llamada recursiva
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("El factorial de " + n + " es " + factorial(n));
    }
}
