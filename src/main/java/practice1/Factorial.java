package practice1;

import java.util.Scanner;
public class Factorial {
    int factorial(int a){
        int result=1;
        for(int i=a;i>0;i--){
          result=result*i;
        }
     return(result);
    }
    public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      Factorial fc=new Factorial();
      int k;
      k=sc.nextInt();
      System.out.print(fc.factorial(k));
    }
}
