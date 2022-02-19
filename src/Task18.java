import java.util.Random;

public class Task18 {
    public static void main(String[] args) {
        int d=0;
        int b=0;
        Random r = new Random();
        int [] a= new int[10];
        for (int i=0 ; i< a.length; i++) {
            a[i] = r.nextInt(15);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i=0; i< a.length; i++) {
            if (a[d]< a[i]) {
                d=i;
            }
        }
        for (int i=0; i< a.length; i++) {
            if (a[b]< a[i] && a[i] != a[d]) {
                b=i;
            }
        }
        System.out.println();
        System.out.println(" Второй по величине элемент в массиве - " + a[b]);
    }

}

