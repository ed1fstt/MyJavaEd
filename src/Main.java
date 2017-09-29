/**
 * Created by shamil on 28.09.2017
 * */

//simple array tricks #4
public class Main {

    public static void main(String[] args) {
       int n =8;
       int[] arr = new int[n];
       for (int i=0;i<n;i++){
           arr[i] = (int)Math.floor(Math.random()*10+1);
           System.out.print(arr[i]+" ");
       }
       for (int i=0;i<n;i++){
           if(i%2==0){
               arr[i] =0;
           }
       }
       System.out.println();
       for (int i = 0;i<n;i++){
           System.out.print(arr[i]+" ");
       }

    }
}
