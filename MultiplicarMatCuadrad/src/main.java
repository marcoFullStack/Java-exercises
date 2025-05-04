import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mat1[][] = new int[3][3];
        int mat2[][] = new int[3][3];

        Random rnd = new Random();
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[0].length;j++){
                mat1[i][j] = rnd.nextInt(5);
                System.out.print(mat1[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<mat2.length;i++){
            for(int j=0;j<mat2[0].length;j++){
                mat2[i][j] = rnd.nextInt(5);
                System.out.print(mat2[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println();
        //se multiplica cada elemento de la fila por el de la columna y se suman valores
        //para sacar el valor de la casilla
        System.out.println("Matriz de multiplicacion");
        int c[][]=new int[mat1.length][mat2[0].length];
        //las columnas de la primera matriz deben ser igual a las filas de la segunda
        if(mat1[0].length!=mat2.length){
            System.out.println("Matriz de multiplicacion no posible");

        }else{
            for(int i=0;i<mat1.length;i++){
                for(int j=0;j<mat2[0].length;j++){
                    for(int k=0;k<mat1[0].length;k++){
                        c[i][j]+=mat1[i][k]*mat2[k][j];
                    }
                }
            }
            for(int i=0;i<c.length;i++){
                for(int j=0;j<c[0].length;j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}

