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

