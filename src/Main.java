/**
 * Created by shamil on 01.11.2017.
 */

//4 (6x7)dimensional array init with random numbers from [0;9]
public class Main {
    private static int getRandomValue() {
        int a = 0;
        a = (int) Math.floor(Math.random() * 10);
        return a;
    }
    public static void main(String[] args) {
        int[][] da = new int[6][7];
        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                da[i][j] = getRandomValue();
            }
        }
        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                System.out.print(da[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}