
/**
 * Created by shamil on 23.10.2017
 */
//bubble sorting in simple array exemple
public class Main {

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = getRandomValue(10);
            System.out.print(a[i] + " ");
        }

        for (int i = a.length - 1; i >= 2; i--) {
            boolean sorted = true;
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private static int getRandomValue(int i) {
        int a = 0;
        a = (int) Math.floor(Math.random() * i + 1);
        return a;
    }
}