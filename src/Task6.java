import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        boolean F = true;
        int [] a = new int[4];
        Random r = new Random();
//        Scanner n = new Scanner(System.in);
        for (int i = 0 ; i<4; i++){
            a [i]= r.nextInt(15);
            System.out.print(a[i] + " ");
        }
        for (int i = 1; i < a.length ; i++) {
            if (a[i]< a[i-1]) {
                F=false;
                break;
            }
        }
        System.out.println();
        if (F) {
            System.out.println("Массив - возрастающая последовательность");
        }
        else
            System.out.println("Массив -  не возрастающая последовательность");
    }
}
