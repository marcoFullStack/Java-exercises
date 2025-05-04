
import java.util.Scanner;
import java.util.*;

public class main {
    public static void main(String[] args) {
        int[][] matborde = new int[4][4];
        for(int i=0;i<matborde.length;i++){
            for(int j=0;j<matborde[i].length;j++){
                if(i==0 || i==3){
                    matborde[i][j]=1;
                }else if(j==0 ||j==3){
                    matborde[i][j]=1;
                }else{
                    matborde[i][j]=0;
                }

            }
        }
        for(int i=0;i<matborde.length;i++){
            for(int j=0;j<matborde[i].length;j++){
                System.out.print(matborde[i][j]);
            }
            System.out.println();
        }
    }
}




