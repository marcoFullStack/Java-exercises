
import java.util.Scanner;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][]=new int[2][2];
        System.out.println("Ingrese el valor de la matriz");
        for(int i=0;i< matriz.length;i++){
            for(int j=0;j< matriz[i].length;j++){
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matriz original");
        for(int i=0;i< matriz.length;i++){
            for(int j=0;j< matriz[i].length;j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
//transponiendo la matriz
        int aux;
        for(int i=0;i< 2;i++){
            for(int j=0;j< i;j++){
                aux=matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[j][i]=aux;

            }
        }
        System.out.println("Matriz transpuesta");
        for(int i=0;i< matriz.length;i++){
            for (int j=0;j< matriz[i].length;j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }

    }
}




