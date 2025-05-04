import java.util.Scanner;

public class OrdenarTresEnteros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arrord[]=new int[3];

        for(int i=0;i<arrord.length;i++){
            System.out.println("Ingrese un número: ");
            arrord[i]=sc.nextInt();
        }
        for(int i=0;i<arrord.length-1;i++){
            for(int j=0;j<arrord.length-1;j++){
            if(arrord[j]>arrord[j+1]) {
                int temp = arrord[j];
                arrord[j] = arrord[j + 1];
                arrord[j + 1] = temp;
            }
            }
        }
        for(int i=0;i<arrord.length;i++){
            System.out.print(arrord[i]+" ");
        }

    }
}
