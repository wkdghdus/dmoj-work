/*
Luke Jang
2021-05-17
CCC '11 J3 - Sumac Sequences
*/

import java.util.*;
import java.io.*;

public class sumacSeq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;
        int counter = 0;
        while (a>=b){
            
            counter++;

            result = a - b;
            
            a = b;
            b = result;

            

        }
        
        System.out.println(counter + 2);



    }
    
}
