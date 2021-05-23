/*
Luke Jang
2021-05-17
COCI '06 Contest 4 #3 Prsteni
*/
import java.util.*;

public class prsteni {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ini = sc.nextInt();
        int gcf = 1;

        for (int i = 0; i < n - 1; i++ ){
            
            double asdf = sc.nextInt();

            for (int j = 1; j<=asdf; j++){
                if ((asdf%j == 0) && (ini%j == 0)){
                    gcf = j; 
                }
            }
            //System.out.println("gcf " + gcf);
            System.out.println((int)ini/gcf + "/" + (int)asdf/gcf);
            

        }


    }
    
}
