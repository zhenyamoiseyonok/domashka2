public class Task2 {
    public static void main(String[] args) {
        int a=1;
        int b=99;
        int [] array = new int[50];
        for (int j=0; j<50; j++) {
            array [j] = a;
                a+=2;
                System.out.print(array[j] + " ");
            }
        System.out.println();
        for (int i=49 ; i>=0; i--) {
            array [i] = b;
            b-=2;
            System.out.print(array[i] + " ");
        }
        }
    }
