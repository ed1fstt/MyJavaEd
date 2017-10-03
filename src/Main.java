import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * Created by shamil on 02.10..2017
 * */

//simple array tricks #5
public class Main {

    public static void main(String[] args) {
       int n = 5;
       int[] arr1 = new int[n];
       int[] arr2 = new int[n];
       double Narr1=0;
       double Narr2=0;

       for (int i=0; i<n;i++){
           arr1[i] = (int)Math.floor(Math.random()*5+1);
           arr2[i] = (int)Math.floor(Math.random()*5+1);
           System.out.print (arr1[i]+" ");
       }
       System.out.println();
        for (int i = 0;i<n;i++){
            System.out.print(arr2[i]+" ");
            Narr1 = Narr1+arr1[i];
            Narr2  = Narr2+arr2[i];
        }
        System.out.println();
        if (Narr1>Narr2){
            System.out.print("First one "+Narr1/n);
        }
        else if (Narr2>Narr1){
            System.out.print("Second one "+Narr2/n);
        }
        else
            System.out.print("They equal "+Narr1/n);
    }
}
