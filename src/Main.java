/**
 * Created by shamil on 03.10.2017
 * */

//simple array tricks #9
public class Main {

    public static void main(String[] args) {
        int n=10;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        double[] arr3 = new double[n];
        for (int i=0;i<n;i++){
            arr1[i] =(int)Math.floor(Math.random()*9+1);
            arr2[i] =(int)Math.floor(Math.random()*9+1);
            arr3[i] = arr1/arr2;
        }

    }
}
