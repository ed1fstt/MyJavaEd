/**
 * Created by shamil on 28.09.2017
 * */

//simple array tricks #3
public class Main {

    public static void main(String[] args) {
       int a= 15;
       int[] arr = new int[a];
       for(int i=0;i<a; i++){
           arr[i] = (int)Math.floor(Math.random()*10);
           System.out.print(arr[i]+" ");
       }
       int qtt = 0;
       for (int i=0;i<a;i++){
           if (arr[i]%2==0){
               qtt++;
           }
       }
        System.out.println();
        System.out.println(qtt);
    }
}
