/**
 * Created by shamil on 05.10.2017
 */
//simple array tricks #12
public class Main {
    private static int getRanPlus() {
        int a = 0;
        a = (int) Math.floor(Math.random() * 11);
        return a;
    }

    private static int getRanMinus() {
        int a = 0;
        a = (int) Math.floor(Math.random() * 11 - 10);
        return a;
    }

    private static int getIndex() {
        int a = 0;
        a = (int) Math.floor(Math.random() * 11);
        return a;
    }

    public static void main(String[] args) {
        int n = 12;
        int[] arr = new int[n];
        int[] arrTemp = new int[n];
        for (int i = 0; i < arrTemp.length; i++) {
            arrTemp[i] = arrTemp.length;
        }
        int h = 0;
        boolean gotIt = false;
        do {
            //minus
            for (int i = 0; i < n / 2; i++) {
                int temp = 0;
                do {
                    temp = getRanMinus();
                }
                while (temp == 0);
                arr[i] = temp;
            }
            //plus
            for (int i = n / 2; i < n; i++) {
                int temp = 0;
                do {
                    temp = getRanPlus();
                }
                while (temp == 0);
                arr[i] = temp;
                gotIt = true;
            }
        }
        while (gotIt != true);

        for (int i = 0; i < n; i++) {
            int index = getIndex();
            for (int j = 0; j < arrTemp.length; j++) {
                if (index == arrTemp[j]) {
                    index = (int) (Math.random() * arrTemp.length);
                    j = -1;
                }
            }
            arrTemp[h] = index;
            h++;
            System.out.print(arr[index] + " ");
        }
    }
}