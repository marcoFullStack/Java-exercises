import java.util.Scanner;

public class TorresDeHanoi {
    public static void hanoi(int n, char origen, char auxiliar, char destino) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
            return;
        }
        // Mover (n-1) discos del origen al auxiliar usando el destino como apoyo
        hanoi(n - 1, origen, destino, auxiliar);

        // Mover el disco n del origen al destino
        System.out.println("Mover disco " + n + " de " + origen + " a " + destino);

        // Mover (n-1) discos del auxiliar al destino usando el origen como apoyo
        hanoi(n - 1, auxiliar, origen, destino);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de discos: ");
        int n = sc.nextInt();

        System.out.println("\nSecuencia de movimientos:");
        hanoi(n, 'A', 'B', 'C'); // A es el origen, B el auxiliar y C el destino

        sc.close();
    }
}
