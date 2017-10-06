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
    private static  int getIndexArray(int t){

        int a =0;
        a =(int)Math.floor(Math.random()*(t+1));
        return a;
    }
    public static void main(String[] args) {
        int n = 12;
        int[] arr = new int[n];
        //int[] farr = new int[n];
        boolean gotIt = false;
        do {
            //minus
            for (int i = 0; i < n/2; i++) {
                int temp = 0;
                do {
                    temp = getRanMinus();
                }
                while (temp == 0);
                arr[i] = temp;

            }
            //plus
            for (int i = n/2; i < n; i++) {
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

        for (int i=0;i<n;i++){
            int j = getIndexArray(i);
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i]=temp;
           // farr[i]=arr[getIndexArray(i)];
            System.out.print(arr[i]+" ");
        }
    }
}