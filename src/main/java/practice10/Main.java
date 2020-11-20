package practice10;
import javax.swing.*;
public class Main {
    public static void main(String[]args) {
       SwingUtilities.invokeLater(()->{
           Calc calc=new Calc();
           calc.setVisible(true);
           calc.setResizable(false);
           calc.setLocation(760,350);
       });
    }
}
