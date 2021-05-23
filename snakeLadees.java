/*
Luke Jang
2021-05-18
CCC '03 S1 - Snakes and Ladders
*/

import java.util.*;
import java.io.*;

public class snakeLadees {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int sq = 1;
        int input;

        while (sq != 100){
            
            input = sc.nextInt();
            
            sq += input;

            if (sq == 54) sq = 19;
            else if (sq == 90) sq = 48;
            else if (sq == 99) sq = 77;
            else if (sq == 9) sq = 34;
            else if (sq == 40) sq = 64;
            else if (sq == 67) sq = 86;
            else if (sq > 100) sq -= input;
            else if (input == 0){
                System.out.println("You Quit!");
                break;
            } 
            
            System.out.println("You are now on square " + sq);

            if (sq == 100) System.out.println("You Win!");

            
        }


    }
    
}
