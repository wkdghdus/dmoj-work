/*
Luke Jang
2021-05-17
COCI '15 Contest 3 #1 Pot
*/
import java.util.*;

public class pot {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;

        for (int i = 0; i<n; i++){
            int p = sc.nextInt();
            int num =(int) p/10;
            int pot = p%10;

            x = x + (int) Math.pow((double)num, (double)pot);
            
        }

        System.out.println(x);

    }
    
}
