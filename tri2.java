/*
Luke Jang
2021-05-12
COCI '07 Contest 5 #1 Tri
*/

import java.util.*;
import java.io.*;

public class tri2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        


            if (b+c == a){
                System.out.println(a + "=" + b + "+" + c);
            }
            else if (b*c == a){
                System.out.println(a + "=" + b + "*" + c);
            }
            else if (a-b == c){
                System.out.println(a +"-" + b + "=" + c);
            }
            else if (a/b == c){
                System.out.println(a + "/" + b + "=" + c);
            }
            else if (a+b == c){
                System.out.println(a + "+" + b + "=" + c);
            }
            else if (a*b == c){
                System.out.println(a + "*" + b + "=" + c);
            }
            else if (b-c == a){
                System.out.println(a +"=" + b + "-" + c);
            }
            else if (b/c == a){
                System.out.println(a + "=" + b + "/" + c);
            }
        
    }
}