import java.util.Random;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r= new Random();
        int d=0;
        int f=0;
        System.out.print("вдеите число С : ");
        int c = s.nextInt();
        System.out.println();
        int [] a = new int[10];
        for (int i=0 ; i < a.length; i++) {
            a [i] = r.nextInt(15);
            System.out.print(a[i] + " ");
            if (a[i]> c) {
            d+=a[i];
            f++;
            }
        }
        System.out.println();
        System.out.println(d);
        System.out.println(f);
        System.out.println("Среднее арифметическое элементов массива, больших ,чем "+ c + " равно " + d/f);
    }
}
