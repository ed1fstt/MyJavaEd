/**
 * Created by shamil on 03.10.2017
 * */

//simple array tricks #6
public class Main {

    public static void main(String[] args) {
        boolean ans = false;
        int n=4;
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] =(int)Math.floor(Math.random()*90+10);
            System.out.print(arr[i]+" ");
        }
        for (int i=0;i<n;i++){
            if (arr[i]<arr[i+1]){
                ans =true;
                if (i==n-2){
                    break;
                }
            }
            else {
                ans=false;
                break;
            }
        }
        System.out.println();
        if (ans==true){
            System.out.print("Sequence is increasing");
        }else
            System.out.print("Sequence is not increasing(chaotic or decreasing)");
    }
}
