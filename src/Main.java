import java.util.Scanner;

/**
 * Created by shamil on 07.10.2017
 */
//simple array tricks #13
public class Main {
    private static int getRandomValue(int ext) {
        int a = 0;
        a = (int) Math.floor(Math.random() * (ext + 1));
        return a;
    }

    public static void main(String[] args) {
        int n = 0;
        boolean fin = false;
        do {
            System.out.println("Please, enter natural number greater then number 3");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                int a = sc.nextInt();
                if (a > 3) {
                    n = a;
//                    System.out.print(" " + n);
//                    System.out.println();
                    int[] arr = new int[n];
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = getRandomValue(n);
                        System.out.print(arr[i] + " ");
                    }
                    fin = true;
                } else {
                    System.out.println("Error, enter correct value: natural number greater then number 3");
                }
            } else {
                System.out.println("Error,enter correct value");
            }
        }
        while (fin == false);
    }
}