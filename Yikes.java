/*
Luke Jang
2021-05-04
DMOPC '19 Contest 4 P0 - Yikes
*/

import java.util.*;
import java.io.*;

public class Yikes {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();

        int x = str.length();
        int diffCount = 0;

        for (int i = 0; i < x; i++){

            char m = str.charAt(i);
            char n = str2.charAt(i);

            if (m != n){
                diffCount += 1;
            }


        }

        if (diffCount == 1){
            System.out.println("LARRY IS SAVED!");
        }
        else System.out.println("LARRY IS DEAD!");


    }
    
}
