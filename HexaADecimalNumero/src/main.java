import java.util.Scanner;

public class HexadecimalADecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número hexadecimal: ");
        String hex = scanner.nextLine();

        // Convierte el número hexadecimal a decimal
        try {
            int decimal = Integer.parseInt(hex, 16);
            System.out.println("El número decimal es: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Número hexadecimal inválido.");
        } finally {
            scanner.close();
        }
    }
}
