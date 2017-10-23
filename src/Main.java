
/**
 * Created by shamil on 22.10.2017
 */
//array sorting example
public class Main {
    private static int getRandomValue(int ext){
        int a = 0;
        a = (int)Math.floor(Math.random()*(ext+1));
        return  a;
    }
    public static void main(String[] args) {
        //array initialization
        int[] a = new int[10];
        for(int i =0;i<a.length;i++){
            a[i] =getRandomValue(10);
            System.out.print(a[i]+" ");
        }
        //array sorting
        for (int i=0;i<a.length;i++){
            int min = a[i];
            int imin = i;
            for (int j=i+1;j<a.length;j++){
                if(a[j]<min){
                    min = a[j];
                    imin = j;
                }
            }
            if (i!=imin){
                int temp = a[i];
                a[i] = a[imin];
                a[imin] = temp;
            }

        }
        System.out.println();
        //array output
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}