package practice1516;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        int a;
       Scanner sc=new Scanner(System.in);
       a=sc.nextInt();
       Structure struct=new Structure();
       struct.add(5);
       struct.initLinks(0, struct.getElement(4), struct.getElement(1),1,2 );
       struct.initLinks(1, struct.getElement(3), struct.getElement(2),4,6 );
       struct.initLinks(2, struct.getElement(4), struct.getElement(3),6,2 );
       struct.initLinks(3, struct.getElement(4), struct.getElement(2),3,5 );
       struct.initLinks(4, struct.getElement(2), struct.getElement(0),5,3 );
       struct.initialPointer();
       while(a!=-1){
           System.out.println(struct.getCommand(struct.pointer.getAction(a)));
           struct.goToNextState(a);
           a=sc.nextInt();
       }
    }
}
