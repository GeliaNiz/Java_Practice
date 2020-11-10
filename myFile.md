##### C:\Users\dom\Desktop\programs\practice5\src\practice1\Command.java
```java
package practice1;

public class Command {
    public static void main(String[]args){
        for(int i=0;i<args.length;i++) {
            System.out.print(args[i]+" ");
        }
    }
}
```
##### C:\Users\dom\Desktop\programs\practice5\src\practice1\Factorial.java
```java
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
```
##### C:\Users\dom\Desktop\programs\practice5\src\practice1\Harmony.java
```java
package practice1;
public class Harmony {
    public static void main(String[]args){
        for(int i=1;i<11;i++){
            System.out.printf("%10.4f",(float)1/i);
        }
    }
}
```
##### C:\Users\dom\Desktop\programs\practice5\src\practice1\Mass.java
```java
package practice1;
import java.util.Arrays;
import java.util.Random;
public class Mass {
    public static void main(String[]args) {
        int[] a = new int[10];
        int i;
        final Random r = new Random();
        for (i = 0; i < 10; i++) {
            a[i]=r.nextInt();
        }
        System.out.println("Не отсортированный массив: ");
        for(i=0;i<10;i++){
            System.out.printf("%17d",a[i]);
        }
        System.out.println();
        Arrays.sort(a);
        System.out.println("Отсортированный массив: ");
        for(i=0;i<10;i++){
            System.out.printf("%17d",a[i]);
        }
    }
}
```
##### C:\Users\dom\Desktop\programs\practice5\src\practice1\Sum.java
```java
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
```
##### C:\Users\dom\Desktop\programs\practice5\src\practice10\Calc.java
```java
package practice10;
import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class Calc extends JFrame {
    final static int longtext=10;
    final static int size_button=50;
    public Calc() {
        super("Calculator");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500,250);

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
```
##### C:\Users\dom\Desktop\programs\practice5\src\practice10\Main.java
```java
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
```
##### C:\Users\dom\Desktop\programs\practice5\src\practice11\Threads.java
```java
package practice11;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Threads {
   static AtomicInteger totalSum=new AtomicInteger(0);
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
         int k=0;
        ArrayList<Thread> threads = new ArrayList<>();
        for(int i=0;i<10;i++){
            work(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("total time: "+ (endTime-startTime));
        startTime=System.currentTimeMillis();
        for (int i = 0; i <  10; i++){
            final int localI = i;
            Thread thread = new Thread(()->work(localI));
            thread.start();
            threads.add(thread);

            }
        for(Thread t: threads){
            t.join();
        }
        endTime = System.currentTimeMillis();
        System.out.println("total time: " + (endTime - startTime));
        System.out.println("total sum: " + totalSum);
    }

    private static void work(int i) {
        long startTime = System.currentTimeMillis();
        long result = doHardWork(i * 1000, 100_000);
        long endTime = System.currentTimeMillis();
        System.out.println(i + ": " + result + " | " + (endTime-startTime));
    }

    private static long doHardWork(int start, int count) {
        long a = 0;
        for (int i = 0; i < count; i++) {
            a+=Math.pow(i,start);
            totalSum.incrementAndGet();
        }
        return a;
    }
}

```
##### C:\Users\dom\Desktop\programs\practice5\src\practice12\Enum.java
```java
package practice12;

public enum Enum {
  YELLOW(93),
    RED(31),
    GREEN(92),
    BLUE(94),
    PURPLE(95);
 private final int number;
 Enum(int number){
     this.number=number;
 }

    public int getNumber() {
        return number;
    }
}
```
##### C:\Users\dom\Desktop\programs\practice5\src\practice12\Main.java
```java
package practice12;
import java.util.Scanner;
public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        PrintColoredText(sc.nextLine(),Enum.PURPLE);

    }
    public static void PrintColoredText(String text,Enum color){
        String COLOR_TEXT="\u001B["+color.getNumber()+"m";
        System.out.println(COLOR_TEXT+text+ANSI_RESET);
    }
}

```
##### C:\Users\dom\Desktop\programs\practice5\src\practice13\IncorrectClassNumberException.java
```java
package practice13;

public class IncorrectClassNumberException extends RuntimeException {

}
```
##### C:\Users\dom\Desktop\programs\practice5\src\practice13\IncorrectMarkException.java
```java
package practice13;

public class IncorrectMarkException extends Exception{
    public IncorrectMarkException(String message) {
        super(message);
    }
}
```
##### C:\Users\dom\Desktop\programs\practice5\src\practice13\Main.java
```java
package practice13;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Pupil pupil=new Pupil();
        String name=sc.nextLine();
        int mark=sc.nextInt();
        int j=0;
        byte[]classnumber=new byte[j];
        j=sc.nextInt();
        for(int i=0;i<j;i++){
            classnumber[i]=sc.nextByte();
        }
        pupil.setClass_number(classnumber,j);
        try{
            pupil.setMark(mark);
            pupil.setName(name);
        } catch (IncorrectMarkException inc){
            System.out.println(inc);
        } catch (Exception exc){
            System.out.println("Некорректное имя ");
        }
        finally {
            System.out.println(pupil.toString());
        }
    }

    }


```
##### C:\Users\dom\Desktop\programs\practice5\src\practice13\Pupil.java
```java
package practice13;

class Pupil {
    String name;
    int mark;
    int class_number[]=new int[2];

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    public int[] getClass_number() {
        return class_number;
    }

    public void setName(String name)throws Exception {
        if (name.length() >= 4) {
            this.name = name;
        } else {
            throw new Exception();
        }
    }

    public void setMark(int mark) throws IncorrectMarkException {
        if((mark!=2)&&(mark!=3)&&(mark!=4)&&(mark!=5)){
            throw new IncorrectMarkException("некорректная оценка");
        }
        else {
            this.mark = mark;
        }
    }

    public void setClass_number(byte[] class_number,int size)throws IncorrectClassNumberException {
        for(int i=0;i<size;i++){
            this.class_number[i]=class_number[i];
        }

    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                ", class_number=" + class_number +
                '}';
    }
}
```
##### C:\Users\dom\Desktop\programs\practice5\src\practice14\Main.java
```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        int number;
        String s1;
        String s2;
        String st;
        StringBuilder patterns= new StringBuilder();
        number = sc.nextInt();
        while (number > 0) {
            s1 = sc.next();
            s2 = sc.next();
            map.put(s1, s2);
            number--;
        }
        st = sc.next();
        List<Map.Entry<String, String>> l = new ArrayList<>(map.entrySet());
        for(int i=0;i<l.size();i++){
            patterns.append(l.get(i).getKey());
            if(i<l.size()-1) {
                patterns.append("|");
            }
        }
        Pattern pat = Pattern.compile(patterns.toString());
        Matcher match = pat.matcher(st);
        String res = match.replaceAll(h->map.get(h.group()));
        System.out.println(res);

    }
}

```
##### C:\Users\dom\Desktop\programs\practice5\src\practice14\WithoutRegularExpressions.java
```java
package practice14;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class WithoutRegularExpressions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<String, String>();
        String[] str=new String[2];
        Boolean b = false;
        int number;
        int index = 0;
        int j = 0;
        String s1="";
        String s2="";
        String st;
        String result = "";
        String curr="";
        number = Integer.parseInt(sc.nextLine());
        while (number > 0) {
            s1=sc.nextLine();
            str=s1.split(" ");
            map.put(str[0], str[1]);
            number--;
        }
        st = sc.nextLine();
        //Конец ввода данных
       List<Map.Entry<String, String>> l = new ArrayList<>(map.entrySet());
        for (j = 0; j < st.length(); j++) {
            b=false;
            for (int i = 0; i < l.size(); i++) {
                if (j + l.get(i).getKey().length() <= st.length()) {
                    curr = st.substring(j, j + l.get(i).getKey().length());
                    if (curr.equals(l.get(i).getKey())) {
                        b = true;
                        result += l.get(i).getValue();
                        j += l.get(i).getKey().length()-1;
                        break;
                    }
                }
            }
            if(!b){
                result+=st.charAt(j);
            }
        }
        System.out.println(result);
    }
}






```
##### C:\Users\dom\Desktop\programs\practice5\src\practice14\WithRegularExpressions.java
```java
package practice14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class WithRegularExpressions {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        int number;
        String s1;
        String s2;
        String st;
        StringBuilder patterns= new StringBuilder();
        number = sc.nextInt();
        while (number > 0) {
            s1 = sc.next();
            s2 = sc.next();
            map.put(s1, s2);
            number--;
        }
        st = sc.next();
        List<Map.Entry<String, String>> l = new ArrayList<>(map.entrySet());
        for(int i=0;i<l.size();i++){
            patterns.append(l.get(i).getKey());
            if(i<l.size()-1) {
                patterns.append("|");
            }
        }
        Pattern pat = Pattern.compile(patterns.toString());
        Matcher match = pat.matcher(st);
        String res = match.replaceAll(h->map.get(h.group()));
        System.out.println(res);

    }
}
```
##### C:\Users\dom\Desktop\programs\practice5\src\practice1516\Main.java
```java
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
```
##### C:\Users\dom\Desktop\programs\practice5\src\practice1516\Node.java
```java
package practice1516;
public class Node{
    private Node[] states=new Node[2];
    private int[] actions=new int[2];

    public Node() {

    }

    public int getAction(int i) {
        return actions[i];
    }

    public void setAction(int action,int i) {
        actions[i] = action;
    }

    public Node getState(int i) {
        return states[i];
    }

    public void setState(Node state,int i) {
         states[i]=state;
    }


}
```
##### C:\Users\dom\Desktop\programs\practice5\src\practice1516\Structure.java
```java
package practice1516;

import java.util.ArrayList;

public class Structure {
    private ArrayList<Node> structure=new ArrayList<>();
    Node pointer;
    void initialPointer(){pointer=structure.get(0);}
    public void add(int count){
        for(int i=0;i<count;i++) {
            Node nd=new Node();
            structure.add(nd);
        }
    }
    public void initLinks(int index, Node one, Node zero, int action1, int action2){
        structure.get(index).setState(one,1);
        structure.get(index).setState(zero,0);
        structure.get(index).setAction(action1,0);
        structure.get(index).setAction(action2,1);
    }
    public void goToNextState(int state_number){
        pointer=pointer.getState(state_number);
    }
    Node getElement(int index){
        return structure.get(index);
    }
    String getCommand(int i){
        switch (i){
            case 1: {
                return "create_project";
            }
            case 2: {
                return "add_library";
            }
            case 3: {
                return "restart";
            }
            case 4: {
                return "test";
            }
            case 5: {
                return "deploy";
            }
            case 6: {
                return "drop_db";
            }
            default:{
                return "";
            }
        }
    }
}
```
##### C:\Users\dom\Desktop\programs\practice5\src\practice1718\Main.java
```java
package practice1718;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Scanner;

public class Main {
    static PrintWriter pr;
    static {
        try {
            pr = new PrintWriter("myFile.md");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    static File basePath = new File("C:\\Users\\dom\\Desktop\\programs\\practice5\\src");
   static File[] packages;
    static ArrayList<String>paths=new ArrayList<>();
    static String myFile=basePath.getPath()+"\\practice1718\\myFile.md";
    static void getPackages(File basePath) {
        if (basePath.isDirectory()) {
            packages = basePath.listFiles();
        }
    }
 static void search(File f){
        File current;
        String path="";
     Stack<File>stack=new Stack<>();
     stack.push(f);
     path+=f.getPath();
     while(!stack.isEmpty()){
         current = stack.pop();
         path+="\\"+current.getName();
         if (current.list() != null) {
             for(String l:current.list()) {
                 stack.push(new File(current.getPath() + "\\" + l));
                 if ((current.getPath() + "\\" + l).endsWith(".java")) {
                     paths.add(current.getPath() + "\\" + l);
                 }
             }
         }

     }
 }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        getPackages(basePath);
        for (File i : packages) {
            if (i.isDirectory()) {
                search(i);
            }
        }
        for (int i = 0; i < paths.size(); i++) {
            try (BufferedReader bf = new BufferedReader(new FileReader(paths.get(i)))) {
                pr.write("##### "+paths.get(i)+"\n");
                String line = bf.readLine();
                pr.write("```java\n");
                while (line != null) {
                    pr.write(line);
                    pr.write('\n');
                    line = bf.readLine();
                }
                pr.write("```\n");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        pr.close();

    }
}

```
##### C:\Users\dom\Desktop\programs\practice5\src\practice2\Main.java
```java
package practice2;

import java.util.ArrayList;

class Shape {
    int height=3;
    int P=25;
    String name="Triangle";

    @Override
    public String toString() {
        return "Shape{" +
                "height=" + height +
                '}';
    }
}
class Ball{

}
class Book{

}
class Dog{
    private String name;
    private int age;
    Dog(String name,int age){
        this.name=name;
        this.age=age;
    }
    int TohumanAge(){return age*7;}

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    String getName(){return name;}
    int gatAge(){return age;}
    void getName(String name){this.name=name;}
    void getAge(int age){this.age=age;}
}
class DogKennels{
    ArrayList<Dog> dogs=new ArrayList<Dog>();
    void Push(Dog d){
        dogs.add(d);
    }
}
public class Main{
    public static void main(String[]args){
        Shape sh=new Shape();
        DogKennels dk=new DogKennels();
        Dog d=new Dog("Kenny",6);
        dk.Push(d);
        System.out.println(sh);
        System.out.print(dk.dogs.get(0));
    }
}
```
##### C:\Users\dom\Desktop\programs\practice5\src\practice3\BookTest.java
```java
package practice3;

class Book{
    String author;
    String title;
    int year;
    String publisher;
    void setAuthor(String author){this.author=author;}
    void setTitle(String title){this.title=title;}
    void setYear(int year){this.year=year;}
    void setPublisher(String publisher){this.publisher=publisher;}
    String getAuthor(){return author;}
    String getTitle(){return title;}
    String getPublisher(){return publisher;}
    int getYear(){return year;}
}
public class BookTest {
    public static void main(String[]args){
        Book book=new Book();
        book.setAuthor("Dostoevsky");
        book.setPublisher("ABC classics");
        book.title="Poor people";
        book.year=1845;
        System.out.println("Book title: "+book.getTitle());
        System.out.println("Author of the book: "+book.getAuthor());
        System.out.println("Book was written in: "+book.getYear());
        System.out.println("Book was published by: "+book.getPublisher());

    }
}
```
##### C:\Users\dom\Desktop\programs\practice5\src\practice3\CircleTest.java
```java
package practice3;

 class Circle {
    private double radius;
    private double Ox;
    private double Oy;
    void setRadius(double radius){this.radius=radius;}
    double getRadius(){return radius;}
    void setOx(double Ox){this.Ox=Ox;}
    void setOy(double Oy){this.Oy=Oy;}
    double getOx(){return Ox;}
    double getOy(){return Oy;}

     @Override
     public String toString() {
         return "Circle{" +
                 "radius=" + radius +
                 ", Ox=" + Ox +
                 ", Oy=" + Oy +
                 '}';
     }
 }

public class CircleTest{
    public static void main(String[]args){
        Circle cr=new Circle();
        cr.setRadius(6);
        cr.setOx(4.3);
        cr.setOy(2.16);
       System.out.print(cr.toString());
    }
}
```
##### C:\Users\dom\Desktop\programs\practice5\src\practice3\HumanTest.java
```java
package practice3;

class Human{
    Head head=new Head();
    Leg legleft=new Leg();
    Leg legrigh=new Leg();
    Hand handleft=new Hand();
    Hand handright=new Hand();
    void Create(){
        legleft.setSize(38);
        legrigh.setSize(35);
        handright.setHand_length(51);
        handleft.setHand_length(50);
        head.setHair_color("blonde");
    }

    @Override
    public String toString() {
        return "Human{" +
                "head=" + head +
                ", legleft=" + legleft +
                ", legrigh=" + legrigh +
                ", handleft=" + handleft +
                ", handright=" + handright +
                '}';
    }

    class Head{
        private String hair_color;
        void setHair_color(String hair_color){this.hair_color=hair_color;}
        String getHair_color(){return hair_color;}

    }
     class Leg{
        private double leg_length;
        private double size;
        void setLeg_length(double leg_length){this.leg_length=leg_length;}
        void setSize(double size){this.size=size;}
        double getLeg_length(){return leg_length;}
        double getSize(){return size;}
    }
   class Hand{
        private double hand_length;
        private double hand_width;
        void setHand_length(double hand_length){this.hand_length=hand_length;}
        void setHand_width(double hand_width){this.hand_width=hand_width;}
        double getHand_length(){return hand_length;}
        double getHand_width(){return hand_width;}
    }
}
public class HumanTest{
    public static void main(String[]args){
        Human human=new Human();
        human.Create();
        human.toString();


    }
}
```
##### C:\Users\dom\Desktop\programs\practice5\src\practice4\Circle.java
```java
package practice4;

public class Circle extends Shape {
    double radius;

    Circle() {
        super();
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;

    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "radius: " + getRadius() + " Area: " + getArea() + " Perimeter: " + getPerimeter();
    }

}
```
##### C:\Users\dom\Desktop\programs\practice5\src\practice4\pr4.java
```java
package practice4;

abstract class Shape{
    String color;
    boolean filled;
    Shape(){

    }
    Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    String getColor(){return color;}
    void setColor(String color){this.color=color;}
    boolean isFilled(){return filled;}
    void setFilled(boolean filled){this.filled=filled;}
    abstract double getArea();
    abstract double getPerimeter();
    public abstract String toString();

}

class Rectangle extends Shape{
    double width;
    double length;
    Rectangle(){super();}
    Rectangle(double width,double length){
        this.length=length;
        this.width=width;
    }
    Rectangle(double width,double length,String color,boolean filled){
        this.length=length;
        this.width=width;
        this.color=color;
        this.filled=filled;
    }
    double getWidth(){return width;}
    void setWidth(double width){this.width=width;}
    double getLength(){return length;}
    void setLength(double length){this.length=length;}
    double getArea(){return width*length;}
    double getPerimeter(){return 2*(width+length);}
    public String toString(){return "width: "+getWidth()+" length: "+getLength()+" Area: "+getArea()+" Perimeter: "+getPerimeter();}
}
class Square extends Shape{
    double side;
    Square(){super();}
    Square(double side){this.side=side;}
    Square(double side, String color,boolean filled){
        this.side=side;
        this.color=color;
        this.filled=filled;
    }
    double getSide(){return side;}
    void setSide(double side){this.side=side;}
    double getArea(){return side*side;}
    double getPerimeter(){return 4*side;}
    public String toString(){return "side: "+getSide()+" Area: "+getArea()+" Perimeter: "+getPerimeter();}


}
public class pr4 {
    public static void main(String[]args){
        Circle circle=new Circle();
        circle.setRadius(4);
        System.out.println(circle.toString());
        Rectangle rect=new Rectangle(12.5,6,"red",true);
        System.out.println(rect.toString());
        Square sq=new Square(6.3);
        sq.setSide(7);
        System.out.println(sq.toString());

    }
}
```
##### C:\Users\dom\Desktop\programs\practice5\src\practice5\Main.java
```java
package practice5;

public class Main {
    public static void main(String[]args){
        MovablePoint mv=new MovablePoint(1,1);
        MovableCircle mc=new MovableCircle(4,6,2);
        MovableRectangle mrect=new MovableRectangle(3,3,6,6);
        mv.moveRight(7);
        mv.moveDown(1);
        System.out.println(mv.toString());
        mc.moveUp(4);
        mc.moveRight(4);
        System.out.println(mc.toString());
        mrect.moveDown(1);
        mrect.moveRight(4);
        System.out.println(mrect.toString());
        System.out.println(mrect.getHeight());
        System.out.println(mrect.getWidth());


    }
}
```
##### C:\Users\dom\Desktop\programs\practice5\src\practice5\Movable.java
```java
package practice5;

public interface Movable {

    void moveUp(int Speed);
    void moveDown(int Speed);
    void moveLeft(int Speed);
    void moveRight(int Speed);
}
```
##### C:\Users\dom\Desktop\programs\practice5\src\practice5\MovableCircle.java
```java
package practice5;


import practice4.Circle;

class MovableCircle extends Circle implements Movable{
    private MovablePoint center;

    MovableCircle(int x,int y,int radius){
        super(radius);
        center=new MovablePoint(x,y);
    }

    @Override
    public void moveUp(int Speed) {
        center.moveUp(Speed);
    }

    @Override
    public void moveDown(int Speed) {
        center.moveDown(Speed);
    }

    @Override
    public void moveLeft(int Speed) {
        center.moveLeft(Speed);
    }

    @Override
    public void moveRight(int Speed) {
        center.moveRight(Speed);
    }

     @Override
     public String toString() {
         return "MovableCircle{" +
                 ", center=" + center +
                 '}';
     }

     public MovablePoint getCenter() {
         return center;
     }

     public void setCenter(MovablePoint center) {
         this.center = center;
     }
 }
```
##### C:\Users\dom\Desktop\programs\practice5\src\practice5\MovablePoint.java
```java
package practice5;

class MovablePoint implements Movable {
    private int x;
    private int y;
    MovablePoint(int x,int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public void moveUp(int Speed) {
        y-=Speed;
    }

    @Override
    public void moveDown(int Speed) {
        y+=Speed;
    }

    @Override
    public void moveLeft(int Speed) {
        x-=Speed;
    }

    @Override
    public void moveRight(int Speed) {
        x+=Speed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
```
##### C:\Users\dom\Desktop\programs\practice5\src\practice5\MovableRectangle.java
```java
package practice5;

public class MovableRectangle implements Movable {
private MovablePoint lUp;
private MovablePoint rDown;
MovableRectangle(int lx,int ly,int rx,int ry){
        lUp=new MovablePoint(lx,ly);
        rDown=new MovablePoint(rx,ry);
    }

    @Override
    public void moveUp(int Speed) {
        lUp.moveUp(Speed);
        rDown.moveUp(Speed);
    }

    @Override
    public void moveDown(int Speed) {
        lUp.moveDown(Speed);
        rDown.moveDown(Speed);
    }

    @Override
    public void moveLeft(int Speed) {
        lUp.moveLeft(Speed);
        rDown.moveLeft(Speed);
    }

    @Override
    public void moveRight(int Speed) {
        lUp.moveRight(Speed);
        rDown.moveRight(Speed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "lUp=" + lUp +
                ", rDown=" + rDown +
                '}';
    }
    void setWidth(int width){
        rDown.setX(rDown.getX()+width);
    }
    void setHeight(int height){
        rDown.setY(rDown.getY()+height);
    }
    int getWidth(){
         return rDown.getX()-lUp.getX();
    }
    int getHeight(){
        return rDown.getY()-lUp.getY();
    }
}

```
##### C:\Users\dom\Desktop\programs\practice5\src\practice6\Main.java
```java
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

```
##### C:\Users\dom\Desktop\programs\practice5\src\practice78\Company.java
```java
package practice78;
import java.util.*;
import java.util.Collections;
import java.util.Vector;
public class Company  {
    private ArrayList<Employee> employees=new ArrayList<>();
    Vector<Integer> personal_id=new Vector<>();
    private String name;
    private long income;
    Company(long income,String name){this.income=income;this.name=name;}
    void hire(Employee emp){
        int j;
        j=(int)(Math.random()*1000000);
        while(personal_id.contains(j)){
            j=(int)(Math.random()*1000000);
        }
        personal_id.add(j);
        emp.setId(j);
        employees.add(emp);
    }
    void hireAll(List<Employee>list){
        for(Employee i: list)hire(i);
    }
    void fire(int number) {
        Employee emp=null;
       for(Employee i:employees){
           if(number==i.getId()){
               emp=i;
           }
       }
       employees.remove(emp);
       personal_id.remove((Integer)number);

    }
    public double getIncome() {
        double sum=0;
        for(Employee i:employees){
            if (i.getEmpPos() instanceof Manager)sum+=((Manager) i.getEmpPos()).getIncome();
        }
        return sum;
    }
    public void setIncome(long income) {
        this.income = income;
    }
    List<Employee>getTopSalaryStaff(int count){
        if(count<=0){
            System.out.println("Вы ввели некорректное число сотрудников");
            return Collections.emptyList();
        }
        Employee temp;
        for(int i=0;i<employees.size();i++){
            temp=getEmployee(i);
            int j=i-1;
            while((j>=0) && (temp.getEmployeeSalary()>getEmployee(j).getEmployeeSalary())){
                employees.set(j+1,getEmployee(j));
                j--;
            }
            employees.set(j+1,temp);
        }
        ArrayList<Employee> emp=new ArrayList<>();
        for(int i=0;i<count;i++) emp.add(getEmployee(i));
        return emp;
    }
    List<Employee>getLowerSalaryStaff(int count){
        if(count<=0){
            System.out.println("Вы ввели некорректное число сотрудников");
            return Collections.emptyList();        }
        Employee temp;
        for(int i=0;i<employees.size();i++){
            temp=getEmployee(i);
            int j=i-1;
            while((j>=0) && (temp.getEmployeeSalary()<getEmployee(j).getEmployeeSalary())){
                employees.set(j+1,getEmployee(j));
                j--;
            }
            employees.set(j+1,temp);
        }
        ArrayList<Employee> emp=new ArrayList<>();
        for(int i=0;i<count;i++) emp.add(employees.get(i));
        return emp;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    public Employee getEmployee(int i){return employees.get(i);}
    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public Vector<Integer> getPersonal_id() {
        return personal_id;
    }

    public void setPersonal_id(Vector<Integer> personal_id) {
        this.personal_id = personal_id;
    }
}
```
##### C:\Users\dom\Desktop\programs\practice5\src\practice78\Employee.java
```java
package practice78;
public class Employee {
    private String name;
    private String surname;
    private double salary;
    private int id;
    EmployeePosition employeePosition;
    Employee(String name,String surname,int salary,EmployeePosition emp){
        this.name=name;
        this.surname=surname;
        this.salary=salary;
        employeePosition=emp;
    }
    public double getEmployeeSalary(){return employeePosition.calcSalary(salary);}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public EmployeePosition getEmpPos() {
        return employeePosition;
    }
    public void setEmployeePosition(EmployeePosition employeePosition) {
        this.employeePosition = employeePosition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + employeePosition.calcSalary(salary) +
                ", employeePosition=" + employeePosition.getJobTitle() +
                '}';
    }
}
```
##### C:\Users\dom\Desktop\programs\practice5\src\practice78\EmployeePosition.java
```java
package practice78;
public interface EmployeePosition {
    String getJobTitle();
    double calcSalary(double baseSalary);
}
```
##### C:\Users\dom\Desktop\programs\practice5\src\practice78\Main.java
```java
package practice78;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int k;
        Company company = new Company(50000000, "Cool company");
        List<Employee> emp = new ArrayList<>();
        for (int i = 0; i < 180; i++) {
            emp.add(new Employee("w1", "w", (int) (Math.random() * 200000 + 8000), new Operator(company)));
        }
        company.hireAll(emp);
        System.out.println();
        emp.clear();
        for (int i = 0; i < 80; i++) {
            emp.add(new Employee("w4", "c", (int) (Math.random() * 300000 + 15000), new Manager(company)));
        }
        company.hireAll(emp);
        emp.clear();
        for (int i = 0; i < 10; i++) {
            emp.add(new Employee("www", "o", (int) (Math.random() * 400000 + 20000), new TopManager(company)));
        }
        company.hireAll(emp);
        emp = company.getTopSalaryStaff(-15);
        System.out.println("Отсортировали по Top salary");
        for (Employee i : emp) {
            System.out.println((int) i.getEmployeeSalary() + " руб.");
        }
        System.out.println();
        emp = company.getLowerSalaryStaff(30);

        System.out.println("Отсортировали по Low salary");
        for (Employee i : emp) {
            System.out.println((int) i.getEmployeeSalary() + " руб.");
        }
        System.out.println();

        k=company.getPersonal_id().size();
        for (int i = 0; i < k/ 2; i++) {
            company.fire(company.getPersonal_id().get((int)(Math.random()*company.getPersonal_id().size())));
        }

        System.out.println("Кол-во сотрудников после увольнения половины " + company.getEmployees().size());
        emp = company.getTopSalaryStaff(15);

        System.out.println("Отсортировали по Top salary");
        for (Employee i : emp) {
            System.out.println((int) i.getEmployeeSalary() + " руб.");

        }
        emp = company.getLowerSalaryStaff(-7);
        System.out.println("Отсортировали по Low salary");
        for (Employee i : emp) {
            System.out.println((int) i.getEmployeeSalary() + " руб.");


        }
    }
}



```
##### C:\Users\dom\Desktop\programs\practice5\src\practice78\Manager.java
```java
package practice78;
public class Manager  implements EmployeePosition {
    private Company comp;
    private double income;
    Manager(Company comp){
        income=Math.random()*25000+115000;
        this.comp=comp;}
    @Override
    public String getJobTitle() {
        return getClass().getName();
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary+0.05*income;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
}
```
##### C:\Users\dom\Desktop\programs\practice5\src\practice78\Operator.java
```java
package practice78;
public class Operator  implements EmployeePosition{
    private Company comp;
    Operator(Company comp){this.comp=comp;}
    @Override
    public String getJobTitle() {
        return getClass().getName();
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary;
    }
}
```
##### C:\Users\dom\Desktop\programs\practice5\src\practice78\TopManager.java
```java
package practice78;
public class TopManager  implements EmployeePosition {
    private Company comp;
    TopManager(Company comp){this.comp=comp;}

    @Override
    public String getJobTitle() {
        return getClass().getName();
    }

    @Override
    public double calcSalary(double baseSalary) {
        if(comp.getIncome()>10000000)
            return 2.5*baseSalary;
        else return baseSalary;
    }
}
```
##### C:\Users\dom\Desktop\programs\practice5\src\Practice9\Company.java
```java
package Practice9;
import java.util.ArrayList;
public class Company {
    private ArrayList<Employee> employees=new ArrayList<>();
    public void hire(int count,ArrayList<Employee> emp){
        employees.addAll(emp);
    }
    public void fire(int count,ArrayList<Employee>emp){
       for(Employee i:emp)employees.remove(i);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
 public void doSomething(EmployeeSelector selector,HandleEmployees handler){
        for(Employee i:employees){
            if(selector.isNeededEmployee(i)) handler.HandlerEmployee(i);
        }
 }
 public void ShowAll(){
        for(Employee i:employees)System.out.println(i.toString());
 }
    @Override
    public String toString() {
        return "Company{" +
                "employees=" + employees +
                '}';
    }
}
```
##### C:\Users\dom\Desktop\programs\practice5\src\Practice9\Employee.java
```java
package Practice9;
import java.time.LocalDate;
public class Employee {
 final private String name;
 final private String surname;
 private String address;
 final private LocalDate date_of_birth;
 private String phone_number;
 private int salary;

    public Employee(String name, String surname, String address, LocalDate date_of_birth, String phone_number, int salary) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.date_of_birth = date_of_birth;
        this.phone_number = phone_number;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", date_of_birth=" + date_of_birth +
                ", phone_number='" + phone_number + '\'' +
                ", salary=" + salary +
                '}';
    }
}
```
##### C:\Users\dom\Desktop\programs\practice5\src\Practice9\EmployeeSelector.java
```java
package Practice9;
public interface EmployeeSelector {
    boolean isNeededEmployee(Employee employee);
}
```
##### C:\Users\dom\Desktop\programs\practice5\src\Practice9\HandleEmployees.java
```java
package Practice9;
public interface HandleEmployees {
    void HandlerEmployee(Employee employee);

}
```
##### C:\Users\dom\Desktop\programs\practice5\src\Practice9\HandlerSalary.java
```java
package Practice9;

public class HandlerSalary implements HandleEmployees{
    @Override
    public void HandlerEmployee(Employee employee) {
        employee.setSalary(employee.getSalary()+1000);
    }
}
```
##### C:\Users\dom\Desktop\programs\practice5\src\Practice9\Main.java
```java
package Practice9;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Company company=new Company();
        Random rd=new Random();
        int k=450;
        Scanner sc=new Scanner(System.in);
        ArrayList<Employee> emp=new ArrayList<>();
        emp.add(new Employee("Katya","hhhh","bjdsbgjkbsfjgk", LocalDate.of(1998,3,10),
                "+7"+(rd.nextInt(8999999)+1000000),7000));
        emp.add(new Employee("Sasha","hhhh","bjdsbgjkbsfjgk", LocalDate.of(1998,3,10),
                "+7"+(rd.nextInt(8999999)+1000000),4000));
        emp.add(new Employee("Katya","hhhh","bjdsbgjkbsfjgk", LocalDate.of(1998,3,10),
                "+7"+(rd.nextInt(8999999)+1000000),300));
        emp.add(new Employee("Katya","hhhh","bjdsbgjfjgk", LocalDate.of(1998,3,10),
                "+7"+(rd.nextInt(8999999)+1000000),7060));
        emp.add(new Employee("Sasha","hhhh","bjdsbgjkbsfjgk", LocalDate.of(1998,3,10),
                "+7"+(rd.nextInt(8999999)+1000000),90));
        emp.add(new Employee("Katya","hhhh","bjdsbgjkbsfjgk", LocalDate.of(1998,3,10),
                "+7"+(rd.nextInt(8999999)+1000000),380));
        company.hire(6,emp);

        company.doSomething(e->e.getName()=="Katya",
                (e-> System.out.println(e.toString())));
        company.doSomething(new EmployeeSelector() {
                                @Override
                                public boolean isNeededEmployee(Employee employee) {
                                    return employee.getSalary() > 450;
                                }
                            }, new HandleEmployees() {
                                @Override
                                public void HandlerEmployee(Employee employee) {
                                    System.out.println("salary : "+ employee.getSalary());
                                }
                            }
        );
        company.doSomething(new PhoneNumberSelector(),new HandlerSalary());
       company.ShowAll();


    }
}
```
##### C:\Users\dom\Desktop\programs\practice5\src\Practice9\PhoneNumberSelector.java
```java
package Practice9;

public class PhoneNumberSelector implements EmployeeSelector{
    @Override
    public boolean isNeededEmployee(Employee employee) {
        if(employee.getPhone_number().charAt(employee.getPhone_number().length()-1)=='5')
            return true;
        return false;
    }
}
```
##### C:\Users\dom\Desktop\programs\practice5\src\sdacha\Main.java
```java
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

```
