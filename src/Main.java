/**
 * Created by shamil on 24.10.2017.
 */

//2 (7x4)dimensional array init with random numbers from [-5;5]
public class Main {

    private static int getRandomValue() {
        int a = 0;
        a = (int) Math.floor(Math.random() * 11 - 5);
        return a;
    }

    public static void main(String[] args) {
        int[] aMult = new int[7];
        int[][] da = new int[7][4];
        int maxIndex = -1;
        int maxRow = -226;
        for (int i = 0; i < da.length; i++) {
            int aMultTemp = 1;
            for (int j = 0; j < da[i].length; j++) {
                da[i][j] = getRandomValue();
                aMultTemp = da[i][j] * aMultTemp;
            }
            aMult[i] = (int) Math.abs(aMultTemp);
        }
        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                System.out.print(da[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < aMult.length; i++) {
            if (aMult[i] > maxRow) {
                maxRow = aMult[i];
                maxIndex = i;
            }
            System.out.print(aMult[i] + " ");
        }
        System.out.println();
        System.out.print(maxRow + " " + maxIndex);
    }
}
