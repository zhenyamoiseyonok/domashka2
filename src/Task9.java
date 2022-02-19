import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.print("Введите число положительное четное число: ");
        int a = q.nextInt();
        int sum1=0;
        int sum2=0;
        if (a%2==1) {
            System.out.println("Вы ввели нечетное число");
        }
        else {
            System.out.println(a);
            Random r = new Random();
            int[] b = new int[a];
            System.out.println();
            for (int i = 0; i < a; i++) {
                b[i] = r.nextInt(15);
                System.out.print(b[i] + " ");
            }
            System.out.println();
            for (int i=0; i<=((a/2)-1); i++) {
                sum1+=b[i];
            }
            System.out.println("Сумма левой половины элементов массива- " + sum1);
            for (int i=(a/2); i<a; i++) {
            sum2+=b[i];
            }
            System.out.println("Сумма правой половины элементов массива- " +sum2);
        }
        if (sum1>sum2) {
            System.out.println("Сумма левой половины элементов массива больше ");
        }
        else if (sum1<sum2) {
            System.out.println("Сумма правой половины элементов массива больше ");
        }
        else System.out.println("Суммы левой и правой половины элементов массива равны ");
    }
}
