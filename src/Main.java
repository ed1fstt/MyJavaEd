/**
 * Created by shamil on 03.10.2017
 * */

//simple array tricks #7
public class Main {

    public static void main(String[] args) {
        int n = 20;
        int[] arr = new int[n];
        arr[0]=1;
        arr[1]=1;
        for (int i=0; i<n;i++) {
            if (i != 0 && i != 1) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
