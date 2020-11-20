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
    static String myFile=basePath.getPath()+"\\practice17\\myFile.md";
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

