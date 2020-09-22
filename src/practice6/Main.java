package practice6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();
        int pole[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                pole[i][j] = sc.nextInt();
            }
        }
       for(int i=1;i<size;i++){
            pole[i][0]=pole[i-1][0]+pole[i][0];
            pole[0][i]=pole[0][i-1]+pole[0][i];
       }
       for(int i=1;i<size;i++){
           for(int j=1;j<size;j++){
               pole[i][j]=pole[i][j]+Math.max(pole[i][j-1],pole[i-1][j]);
           }
       }
        System.out.println(pole[size-1][size-1]);

    }
}

