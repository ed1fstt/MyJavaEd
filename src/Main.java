/**
 * Created by shamil on 25.09.2017
 * */

//simple array tricks #2
public class Main {

    public static void main(String[] args) {
        int a = 0;
        for(int i = 1; i<=99; i++){
            if(i%2!=0){a++;}
        }
        int[] mas = new int[a];
        for (int i=1, b=0;i<=99;i++){
            if (i%2!=0){
                mas[b]=i;
                System.out.print(mas[b]+" ");
                b++;
            }
            }
            System.out.println();
        for(int i=0; i<mas.length; i++){
            System.out.println(mas[i]);
        }
    }
}
