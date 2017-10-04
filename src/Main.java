import java.util.Scanner;

/**
 * Created by shamil on 03.10.2017
 */

//simple array tricks #11
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int n = sc.nextInt();
            if (n>0 && n%2==0){
                int[] arr = new int[n];
                for (int i=0;i<n;i++){
                    arr[i] = (int)Math.floor(Math.random()*11-5);
                    System.out.print(arr[i]+" ");
                }
            }

        }
    }
}

