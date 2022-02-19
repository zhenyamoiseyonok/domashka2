import java.util.Random;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        System.out.print("Введите любое число в пределах 15: ");
        int f=0;
        int d = s.nextInt();
        int [] a = new int[10];
        for (int i = 0; i< a.length; i++) {
            a[i]= r.nextInt(15);
            System.out.print(a[i] + " ");
            if (a[i] == d) {
                f++;
            }
        }
        System.out.println();
        System.out.println("Число " + d + " встречается в массиве " + f + " раз(a)");
    }
}

