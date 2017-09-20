/**
 * Created by shamil on 18.09.2017.
 */

//how many lucky tickets we have 
public class Main {
    //devide two numbers
    //return summ of number
    private static int f(int num){
        int sum = 0;
        while (num!=0){
            sum = sum+(num%10);
            num/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int qttt=0;
        int number1;
        int number2;
        for (int i=1001;i<=999999;i++){
            //div
            number1=i%1000;
            number2=i/1000;
            if (f(number1)==f(number2)){qttt++;}
        }
        System.out.println(qttt);


    }
}
