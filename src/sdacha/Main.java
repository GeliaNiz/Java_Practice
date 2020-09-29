package sdacha;
import java.util.Scanner;
public class Main {

        public static int k=0;
        static void solve(int n) {
            for(int i=n/5;i>=0;i--){
                for(int j=(n-i*5)/3;j>=0;j--){
                    k++;

                }
            }
        }
        public  static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int N;
            N=sc.nextInt();
            solve(N);
            System.out.println(k);
        }
    }

