/**
 * Created by shamil on 18.09.2017.
 */
//electronic watches coincidence task 15
public class Main {

    public static void main(String[] args) {
        int coin = 0;
        int f1 =0;
        int f2=0;
        int f3=0;
        int f4=0;
        for (int i=0;i<=23;i++){
            f1=i%10;
            f2=i/10;
            for (int m=0;m<=59;m++){
                f3=m%10;
                f4=m/10;
                if ((f1==f3&&f2==f4)||(f1==f4&&f2==f3)){
                    System.out.println(f2+f1+":"+f4+f3);
                    coin = coin+1;
                }
            }
        }
        System.out.println(coin);
    }
}
//00:00
//        01:10
//        02:20
//        03:30
//        04:40
//        05:50
//        10:01
//        11:11
//        12:21
//        13:31
//        14:41
//        15:51
//        20:02
//        21:12
//        22:22
//        23:32