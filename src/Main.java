import sun.org.mozilla.javascript.internal.regexp.SubString;

/**
 * Created by shamil on 24.10.2017.
 */

//2 dimensional array init with random numbers from [-99;99]
public class Main {

    private static int getRandomValue() {
        int a = 0;
        a = (int) Math.floor(Math.random() * 199 -99);
        return a;
    }

    public static void main(String[] args) {
        int maxv = -99;
        int[][] da = new int[5][8];
        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                da[i][j] = getRandomValue();
                if (da[i][j]>=maxv){
                    maxv = da[i][j];
                }
            }
        }

        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                System.out.print(da[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print(maxv);

    }
}
