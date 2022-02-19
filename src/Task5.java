import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int sum1=0;
        int sum2=0;
        double s1;
        double s2;
        int [] a = new int[5];
        int [] b = new int[5];
        Random s = new Random();
        for (int i=0 ; i<5; i++) {
            a [i]= s.nextInt(15);
            System.out.print(a[i] + " ");
            sum1= sum1 + a[i];
                   }
        System.out.println();
        for (int i=0 ; i<5; i++){
            b [i]= s.nextInt(15);
            System.out.print(b[i] + " ");
            sum2 = sum2 + b[i];
        }
        s1= sum1/5.0;
        s2= sum2/5.0;
        System.out.println();
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(s1);
        System.out.println(s2);
        if ((s1) > (s2)) {
            System.out.println("Среднее арифметическое первого массива больше");
        }
        else if ((s1 ) < (s2 )) {
            System.out.println("Среднее арифметическое второго массива больше");
        }
        else System.out.println("Среднее значение массивов равно");
    }
}
