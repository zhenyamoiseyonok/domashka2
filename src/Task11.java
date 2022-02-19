import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
        int c = 1;
        int[] a = new int[10];
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(15);
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0) {
                c *= a[i];
            }
        }
        System.out.println();
        System.out.println("Произведение элементов, кратных 3 равно: " + c);
    }
}