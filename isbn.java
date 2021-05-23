/*
Luke Jang
2021-05-16
CCC '09 J1 - ISBN
*/

import java.util.*;
import java.io.*;


public class isbn {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int initial = 9*1 + 7*3 + 8*1 + 0*3 + 9*1 + 2*3 + 1*1 + 4*3 + 1*1 + 8*3;
        int a = sc.nextInt();
        int b = sc.nextInt() * 3;
        int c = sc.nextInt();

        initial = initial + a + b + c;

        System.out.println("The 1-3-sum is " + initial);
        

    }
    
}
