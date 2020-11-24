package practice2324;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Worker worker=new Worker();
        while(true) {
            worker.getAll();
            worker.performingAllOperations();
            Thread.sleep((int)(Math.random()*1000+1000));
        }
    }
}
