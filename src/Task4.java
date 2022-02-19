import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int [] array = new int[20];
        Random s = new Random();
        for (int i=0 ; i<20 ; i++) {
            array [i] = s.nextInt(20);
            System.out.print(array [i] + " ");
        }
        System.out.println();
        for (int i=0; i<20; i++) {
            if (i % 2==1) {
                array [i] =0;
            }
            System.out.print(array[i] + " ");
        }
    }
}