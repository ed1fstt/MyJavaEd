/**
 * Created by shamil on 18.09.2017.
 */
//how many broken signs we have
public class Main {
    public static void main(String[] args) {
        int bnum=0;
        for (int i=0;i<=50000;i++){
            int num=i;
            while (num!=0){
                if (num%10==2){
                    bnum=bnum+1;
                    break;
                }
                num=num/10;

            }
        }
        System.out.println(bnum);
    }
}
