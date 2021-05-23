/*
Luke Jang
2021-05-02
CCC '10 J1 - What is n, Daddy?
*/

import java.util.*;
import java.io.*;

public class whatIsN {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n;
        int i = 0;

        n = sc.nextInt();

        if ((n == 10) || (n == 9) || n == 1){
            i = 1;
        }
        else if(n == 8 || n == 7 || n == 3 || n == 2){
            i = 2;

        }
        else if( n == 6 || n == 5 || n == 4){
            i = 3;
        }

        System.out.println(i);
    }
}
