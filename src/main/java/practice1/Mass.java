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
