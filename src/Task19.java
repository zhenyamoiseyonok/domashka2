import java.util.Random;

public class Task19 {
    public static void main(String[] args) {
        Random r= new Random();
        int c=0;
        int []a = new int[10];
        for (int i=0 ; i<a.length; i++) {
            a[i] = r.nextInt(-10, -1);
            System.out.print(a[i] + " ");
        }
        for (int j=0 ; j< a.length; j+=2) {
            if (a[c]<a[j]) {
                a[c]= a[j];
            }
        }
        System.out.println();
        System.out.println(a[c]);
    }
}
