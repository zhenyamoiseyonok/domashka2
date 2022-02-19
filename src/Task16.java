import java.util.Random;

public class Task16 {
    public static void main ( String [] args) {
        Random r = new Random();
        int d=0;
        int g=0;
        int [] a = new int[10];
        for ( int i = 0 ; i< a.length ; i++) {
            a[i] = r.nextInt(15);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for ( int i = 0 ; i< 9 ; i++) {
            for (int j = i + 1 ; j< a.length ; j++) {
                if (a[i]== a[j] ) {
                d++;
                }
                if (a[i] != a[j]) {
                    g++;
                 }
            }
        }
        System.out.println(d);
        System.out.println(g);
        if (d != 0) {
        System.out.println("Элементы массива не различны");
        }
        else if (g != 0)
        System.out.println("Элементы массива различны");
    }
}
