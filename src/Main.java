/**
 * Created by shamil on 03.10.2017
 */

//simple array tricks #10
public class Main {

    public static void main(String[] args) {
        int n = 11;
        int a1=-1, m1=0;
        int a2=0, m2=0;
        int a3 = 1, m3=0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) Math.floor(Math.random() * 3 - 1);
            System.out.print(arr[i]+" ");
        }
        for (int i=0;i<n;i++){
           if (arr[i]==a1){
              m1++;
           }
           else if (arr[i]==a2){
               m2++;
           }
           else
               m3++;
        }
        System.out.println();
        if (m1>m2 && m1>m3){
            System.out.print("-1 | "+m1);
        }
        else if(m2>m1 && m2>m3){
            System.out.print("0 | "+m2);
        }
        else if (m3>m1 && m3>m2){
            System.out.print("1 | "+m3);
        }
        else
            System.out.print("We have equal numbers");
    }


}

