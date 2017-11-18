//*** Created by shamil 18.11.2017
//static methods
public class Main {
    public static int randomGen(int a, int b){
        int n=0;
        if (a==0) {
            n = (int) Math.floor(Math.random() * Math.abs(b + 1) + a);
        }
        else if (a>0){
            n = (int) Math.floor(Math.random() * Math.abs(b - 1) + a);
        }
        else if (a<0){
            n = (int) Math.floor(Math.random() *(b-a+1) + a);
        }
        return n;
    }
    public static void main(String[] args) {
         int[] ar = new int[40];
    for (int i=0;i<ar.length;i++){
        ar[i] = randomGen(10,15);
        System.out.print(ar[i]+" ");
    }
    System.out.println();
    }
}