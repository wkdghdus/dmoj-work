/*
Luke Jang
2021-05-17
COCI '10 Contest 4 #2 Parket
*/
import java.util.*;
import java.io.*;


public class parket {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int r = sc.nextInt();
        int round = (int) Math.ceil((double)r/2);
        int w = 0;
        int l;
        int finalW = 0;
        int finalL = 0;
        

        //finding the factors of r
        for (int i = 1; i <= round; i++){
            
            //if a number can divide the total into an int
            if (r%i == 0){
                w = i;
                l = r/i;

                
                if (w *2 + l * 2 + 4 == b){
                    finalW = w + 2;
                    finalL = l + 2;
                    break;
                }

            }

        }
        
        

        System.out.println(finalL + " " + finalW);


    }
    
}
