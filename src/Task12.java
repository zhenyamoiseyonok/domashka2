import java.util.Random;

public class Task12 {
    public static void main(String[] args) {
        int c=0;
        int f=0;
        double d;
        int [] a= new int[11];
        Random r = new Random();
        for (int i=0; i<a.length; i++) {
            a[i] = r.nextInt(15);
            System.out.print(a[i] + " ");
        if (i % 2 ==1) {
            c+=a[i];
            f++;
        }
        }
        d= c / f;
        System.out.println();
        System.out.println(c);
        System.out.println(f);
        System.out.format("Среднее арифметическое элементов с нечетными номерами равно: " + d);


    }
}
