import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        int [] a = new int[10];
        int [] b= new int[10];
        int [] c= new int[10];
        Random r= new Random();
        for (int i = 0 ; i< a.length; i++){
//            a[i] = r.nextInt((9)+1);
            a[i] = (int) Math.round((Math.random() * 10) +1 );
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0 ; i< b.length; i++){
//            b[i] = r.nextInt(9);
            b[i] = (int) Math.round((Math.random() * 10) +1 );

            System.out.print(b[i] + " ");
        }
        System.out.println();
        for (int i = 0 ; i < c.length; i++) {
            c[i]= a[i]/b [i] ;
            System.out.print(c[i]+ " ");
        }
    }
}
