import sun.org.mozilla.javascript.internal.regexp.SubString;

/**
 * Created by shamil on 24.10.2017.
 */

//2 dimensional array init with random numbers from [10;99]
public class Main {

    private static int getRandomValue() {
        int a = 0;
        a = (int) Math.floor(Math.random() * 90 + 10);
        return a;
    }
    
    public static void main(String[] args) {
        int[][] da = new int[8][5];
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

    }
}
