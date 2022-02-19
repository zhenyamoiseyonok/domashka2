import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Random r= new Random();
        Scanner q= new Scanner(System.in);
        System.out.println("Введите число, большее 3 ");
        int n = q.nextInt();
        int [] a = new int[n];
        if (n<3) {
            System.out.println("Вы ввели неверное число!!!");
        }
        else for (int i=0; i<n ; i++) {
        a[i]= r.nextInt(n);
            System.out.print( a[i] + " ");
        }
        System.out.println();
        for (int i=0; i<n ; i++) {
            if (a[i]%2==0 && a[i] !=0) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
