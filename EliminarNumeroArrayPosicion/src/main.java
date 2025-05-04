import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int arr[]=new int[5];
        int posicion=0;

        Scanner entrada = new Scanner(System.in);

        for(int i=0;i<5;i++){
            arr[i]=entrada.nextInt();
        }
        System.out.println();
        System.out.println("Posicion a eliminar");
        posicion=entrada.nextInt();
        for(int i=posicion;i<4;i++){
            arr[i]=arr[i+1];
        }
        System.out.println("La tabla queda:");
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
