package practice10;
import javafx.geometry.VerticalDirection;
import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class Calc extends JFrame {
    final static int longtext=10;
    final static int size_button=50;
    public Calc() {
        super("Calculator");
        DecimalFormat dec=new DecimalFormat("###.###");
        JPanel panel=new JPanel();
        JPanel panel2=new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel2.setSize(500,80);
        JPanel panel3=new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel panel4=new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel panel5=new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel5.setSize(500,80);
        panel4.setSize(500,80);
        panel3.setSize(500,120);
        JLabel label1=new JLabel("1st number: ");
        JLabel label2=new JLabel("2nd number: ");
        JLabel label3=new JLabel("Result: ");
        JTextField number1 = new JTextField(longtext);
        JTextField number2 = new JTextField(longtext);
        JTextField result = new JTextField(longtext);
        JButton button1=new JButton("+");
        JButton button2=new JButton("-");
        JButton button3=new JButton("*");
        JButton button4=new JButton("/");
        Font font=new Font("Helvetica",Font.BOLD,20);
        result.setEditable(false);
        label1.setFont(font);
        number1.setFont(font);
        number2.setFont(font);
        label2.setFont(font);
        button1.setFont(font);
        button2.setFont(font);
        button3.setFont(font);
        button4.setFont(font);
        label3.setFont(font);
        result.setFont(font);


        panel2.add(label1);
        panel2.add(number1);
        panel.add(panel2);
        panel3.add(button1);
        panel3.add(button2);
        panel3.add(button3);
        panel3.add(button4);
        panel.add(panel3);
        panel4.add(label2);
        panel4.add(number2);
        panel.add(panel4);
        panel5.add(label3);
        panel5.add(result);
        panel.add(panel5);
        add(panel);

        button1.addActionListener(action->
        {
            if(check(number1,number2)) {
                result.setText("");
                result.setText(dec.format(Double.parseDouble(number1.getText()) + Double.parseDouble(number2.getText()) ));
            }
        });
        button2.addActionListener(action->
        {
            result.setText("");
            if(check(number1,number2)) {
                result.setText(dec.format(Double.parseDouble(number1.getText()) - Double.parseDouble(number2.getText()) ));
            }
        });
        button3.addActionListener(action->
        {
            result.setText("");
            if(check(number1,number2)) {
                result.setText(dec.format(Double.parseDouble(number1.getText()) * Double.parseDouble(number2.getText()) ));
            }
        });
        button4.addActionListener(action->
        {
            result.setText("");
            if(check(number1,number2)) {
                try {

                    result.setText(dec.format(Double.parseDouble(number1.getText()) / Double.parseDouble(number2.getText()) ));
                } catch (IllegalArgumentException e) {
                    result.setText("Error!You tried to divide by zero!");
                }
            }
        });

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500,400);

    }
    boolean check(JTextField f1,JTextField f2){
        if(f1.getText().equals("") || f2.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Не оставляйте поля ввода пустыми!");
            return false;
        }
        try{
            Double.parseDouble(f1.getText());
            Double.parseDouble(f2.getText());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Введите пожалуйста цифры!");
            return false;
        }
        return true;
    }

}
