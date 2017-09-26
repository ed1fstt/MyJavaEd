/**
 * Created by shamil on 25.09.2017
 * */

//simple array tricks
public class Main {

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i=0; i< a.length; i++){
            a[i] =2*i+2;
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println();
        int b=0;
        while (b<a.length){
            System.out.println(a[b]);
            b++;
        }

    }
}
