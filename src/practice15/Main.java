package practice15;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        int a;
       Scanner sc=new Scanner(System.in);
       a=sc.nextInt();
       Structure struct=new Structure();
       struct.Add(5);
       struct.InitLinks(0, struct.getElement(4), struct.getElement(1),1,2 );
       struct.InitLinks(1, struct.getElement(3), struct.getElement(2),4,6 );
       struct.InitLinks(2, struct.getElement(4), struct.getElement(3),6,2 );
       struct.InitLinks(3, struct.getElement(4), struct.getElement(2),3,5 );
       struct.InitLinks(4, struct.getElement(2), struct.getElement(0),5,3 );
       struct.InitialPointer();
       while(a!=-1){
           System.out.println(struct.getCommand(struct.pointer.getAction(a)));
           struct.GoToNextState(a);
           a=sc.nextInt();
       }
    }
}
