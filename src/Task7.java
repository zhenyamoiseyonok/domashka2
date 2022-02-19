import java.util.Random;
public class Task7 {
    public static void main(String[] args) {
        int[] a = new int[12];
        int b = 0;
        Random r = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(15);
            System.out.print(a[i] + " ");
            if (a[i] > a[b]) {
                b = i;
            }
        }
        System.out.println();
        System.out.print("Индекс максимального числа " + b);
        System.out.print(" , а само число равно : "+a[b]);
    }
}
