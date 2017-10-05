/**
 * Created by shamil on 05.10.2017
 */

//simple array tricks #12
public class Main {

    private static int getRan() {
        int a = 0;
        a = (int) Math.floor(Math.random() * 21 - 10);
        return a;
    }

    public static void main(String[] args) {
        int n = 12;
        int[] arr = new int[n];
        boolean gotIt = false;
        do {
            for (int i = 0; i < n; i++) {
                int temp = 0;
                do {
                    temp = getRan();
                }
                while (temp == 0);
                arr[i] = temp;
                System.out.print(arr[i]+" ");
                gotIt = true;
            }
        }
        while (gotIt != true);
    }
}