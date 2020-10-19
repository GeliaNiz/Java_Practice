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


