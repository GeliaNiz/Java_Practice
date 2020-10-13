package practice11;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Threads {
   static AtomicInteger totalSum=new AtomicInteger(0);
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
         int k=0;
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i <  10; i++){
            final int localI = i;
            Thread thread = new Thread(()->work(localI));
            thread.start();
            threads.add(thread);

            }
        for(Thread t: threads){
            t.join();
        }
        long endTime = System.currentTimeMillis();
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

