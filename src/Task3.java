import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int [] array= new int[15];
        int sum=0;
        Random s = new Random();
        for (int i=0; i<15 ; i++) {
            array [i]= s.nextInt(99);
            System.out.print(array[i] + " ");
            if (array[i]%2==0 && array [i] !=0) {
                sum++;
            }
        }
        System.out.println();
        System.out.println("Четных элементов в массиве равно : " + sum);

    }
}
