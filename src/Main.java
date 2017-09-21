/**
 * Created by shamil on 18.09.2017.
 */
//unlucky numbers task 16
public class Main {
    private static boolean f4(int num){
        boolean rez = false;
        int tnum=0;
        String s = String.valueOf(num);
        if (s.indexOf('1')!=-1&s.indexOf('1')+1==s.indexOf('3')){
                //||s.indexOf('1')+2==s.indexOf('3')||s.indexOf('1')+3==s.indexOf('3')||s.indexOf('1')+4==s.indexOf('3'))){
            rez = true;
        }
        while (num!=0){
            tnum=num%10;
            num=num/10;
            if (tnum == 4){
                rez = true;
                break;}
        }
        return rez;
    }
    public static void main(String[] args) {
//        int unA  =13;
//        int unJ = 4;
        int qtt = 0;
        for(int i=1; i<=99999;i++){
            //4
            if (f4(i)){
                System.out.println(i);
                qtt=qtt+1;
            }
        }
        System.out.println(qtt);
    }
}
