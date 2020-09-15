package practice1;
import java.util.Scanner;
public class Sum {
    public static void main(String[]args){
        int[]a;
        int size,i,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        size=sc.nextInt();
        a=new int[size];
        System.out.println("Введите элементы массива: ");
        for(i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<size;i++){
            sum+=a[i];
        }
    System.out.println("Сумма элементов массива равна: "+sum);
    }
}
