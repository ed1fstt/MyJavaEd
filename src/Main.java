/**
 * Created by shamil on 03.10.2017
 * */

//simple array tricks #8
public class Main {

    public static void main(String[] args) {
        int n=12;
        int m=0;
        int mi=0;
        int[] arr = new int[n];
        for (int i=0; i<n;i++){
            arr[i] =(int)Math.floor(Math.random()*31-15);
            System.out.print(arr[i]+" ");
        }
        m=arr[0];
        mi=0;
        for (int i=0;i<n;i++){
            if (arr[i]>m){
                m=arr[i];
                mi=i;
            }
        }
        System.out.println();
        System.out.print(m);
        System.out.println();
        System.out.print(mi);
    }
}
