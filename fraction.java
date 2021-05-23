/*
Luke Jang
2021-05-07
CCC '02 S2 - Fraction Action
*/

import java.util.*;
import java.io.*;

public class fraction {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int numerator = sc.nextInt();
        int denominator = sc.nextInt();

        int mod = numerator % denominator;
        int result = (int) numerator/denominator;

        if (mod == 0){
            System.out.println(result);
        }
        else{

            int gcd = 1;
            
            for (int i= denominator-1; i>=1; i=i-1){
                        
                int test1 = mod%i;
                int test2 = denominator%i;
                if ((test1==0) && (test2==0)){
                    gcd = i;
                    break; 
                }
            }

            if (result == 0){
                System.out.println(mod/gcd + "/" + denominator/gcd);
            }
            else{
                    System.out.println(result +" " + mod/gcd + "/" + denominator/gcd);
                }
            }
        
        

    }
}