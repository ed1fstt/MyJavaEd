import java.util.Scanner;

/**
 * Created by shamil on 05.10.2017
 */

//simple array tricks #11
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("Enter dimension of the array");
            if (sc.hasNextInt()) {
                int n = sc.nextInt();
                int sum1 = 0;
                int sum2 = 0;
                if (n > 0 && n % 2 == 0) {
                    int[] arr = new int[n];
                    for (int i = 0; i < n; i++) {
                        arr[i] = (int) Math.floor(Math.random() * 11 - 5);
                        System.out.print(arr[i] + " ");
                    }
                    //first half
                    for (int i = 0; i < n / 2; i++) {
                        sum1 = sum1 + arr[i];
                    }
                    //second half
                    for (int i = n / 2; i < n; i++) {
                        sum2 = sum2 + arr[i];
                    }
                    if (sum1 > sum2) {
                        System.out.println();
                        System.out.println("First half is bigger " + sum1);
                    } else if (sum2 > sum1) {
                        System.out.println();
                        System.out.println("Second half is bigger " + sum2);
                    } else {
                        System.out.println();
                        System.out.println("Two halfs are equal " + sum1);
                    }
                } else
                    System.out.println("PLEASE, ENTER CORRECT NUMBER");
            }
        }
        while (true);
    }
}