//*** Created by shamil 18.11.2017
//static methods 2
public class Main {
    public static void printAr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int randomGen(int a, int b) {
        int n = 0;
        if (a == 0) {
            n = (int) Math.floor(Math.random() * Math.abs(b + 1) + a);
        } else if (a > 0) {
            n = (int) Math.floor(Math.random() * Math.abs(b - 1) + a);
        } else if (a < 0) {
            n = (int) Math.floor(Math.random() * (b - a + 1) + a);
        }
        return n;
    }

    public static void main(String[] args) {
        for (int j = 0; j < 5; j++) {
            int[] ar = new int[10];
            for (int i = 0; i < ar.length; i++) {
                ar[i] = randomGen(1, 9);
            }
            printAr(ar);
        }
    }
}