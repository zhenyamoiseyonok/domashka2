import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        Random r = new Random();
        int c=0;
        int [] a= new int[10];
        for (int i=0 ; i< a.length; i++) {
            a[i] = r.nextInt(15);
            System.out.print(a[i] + " ");
            if (i % 2 ==1 && a [i] > c) {
                c = a[i] ;
            }
        }
        System.out.println();
        System.out.println("Наименьший нечетный элемент - " + c);
    }
}
