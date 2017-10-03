import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * Created by shamil on 03.10.2017
 * */

//simple array tricks #9
public class Main {
    //    private static DecimalFormat df2 = new DecimalFormat(".##");
    public static void main(String[] args) {
        int n = 10;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int an = 0;
        double[] arr3 = new double[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = (int) Math.floor(Math.random() * 9 + 1);
            arr2[i] = (int) Math.floor(Math.random() * 9 + 1);
            arr3[i] = (double) arr1[i] / arr2[i];
            if (arr3[i] % 1 == 0) {
                an++;
            }
//            arr3[i] = df2.format((double)arr3[i]);

        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr1[i] + " ");
//            if (i == n - 1) {
//                System.out.println();
//            }
//            System.out.print(arr2[i] + " ");
//            if (i == n - 1) {
//                System.out.println();
//            }
//            System.out.print(arr3[i] + " ");
//            if (i == n - 1) {
//                System.out.println();
//            }
//        }

        System.out.print(Arrays.toString(arr1));
        System.out.println();
        System.out.print(Arrays.toString(arr2));
        System.out.println();
        System.out.print(Arrays.toString(arr3));
        System.out.println();
        System.out.print(an);

    }


}

