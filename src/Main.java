
/**
 * Created by shamil on 24.10.2017
 */
//multidimensional array example
public class Main {

    public static void main(String[] args) {
        int[][] da = new int[6][4];
        for (int i=0;i<da.length;i++){
            for (int j=0;j<da[i].length;j++){
                da[i][j] = (int)(Math.random()*10);
            }
        }

        for (int i=0;i<da.length;i++){
            for (int j=0;j<da[i].length;j++){
                System.out.print(da[i][j]+" ");
            }
            System.out.println();
        }
    }
}