//*** Created by shamil on 04.11.2017.


//multiplicational array
public class Main {
    private static int getRandomValue() {
        int a = 0;
        a = (int) Math.floor(Math.random() * 9);
        return a;
    }

    private static int getRandomIndex() {
        int b = 0;
        b = (int) Math.floor(Math.random() * 8);
        return b;
    }

    public static void main(String[] args) {
        //**********initialize mult array****************
        int[][] aMult = new int[8][8];
        String[][] aMultString = new String[8][8];
        int[] aTask = new int[15];
        String[] aTaskString = new String[15];
        for (int i = 0; i < aTask.length; i++) {
            aTask[i] = -1;
        }
        for (int i = 0; i < aMult.length; i++) {
            for (int j = 0; j < aMult[i].length; j++) {
                aMult[i][j] = (i + 2) * (j + 2);
                aMultString[i][j]=(i + 2) +"*"+ (j + 2);
            }
        }
        for (int i = 0; i < aMult.length; i++) {
            for (int j = 0; j < aMult[i].length; j++) {
                System.out.print(aMult[i][j] + " ");
            }
            System.out.println();
        }
        //**********fill array with unique values
        int n = 0;
        while (n != 15) {
            int temp = 0;
            int indexOfi =getRandomIndex();
            int indexOfj =getRandomIndex();
            temp = aMult[indexOfi][indexOfj];
            for (int i = 0; i < aTask.length; i++) {
                if (aTask[i] == temp) {
                    temp = 0;
                }
            }
            if (temp != 0) {
                aTask[n] = temp;
                aTaskString[n] =aMultString[indexOfi][indexOfj];
                n++;
            }
        }
        System.out.println();
        for (int i = 0; i < aTask.length; i++) {
            System.out.print(aTask[i] + " ");
        }
        System.out.println();
        for(int i=0; i<aTaskString.length;i++){
            System.out.print(aTaskString[i]+" ");
        }
    }
}