/*
Luke Jang
2021-05-07
COCI '07 Contest 5 #1 Tri
*/

import java.util.*;
import java.io.*;


public class tri {
    public static void main(String[] aStrings){
        
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        for (int i=0; i<3; i++){
            arr [i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int a = arr[0];
        int b = arr[1];
        int c = arr[2];

        if (a+b == c){
            System.out.println(a + "+" + b + "=" + c);
        }
        else if (c - a == b){
            System.out.println(c + "-" + a + "=" + b);
        }
        else if (c - b == a){
            System.out.println(c + "-" + b + "=" + a);
        }
        else if (a*b == c){
            System.out.println(a + "*" + b + "=" + c);
        }
        else if (c/a == b){
            System.out.println(c + "/" + a + "=" + b);
        }
        else {
            System.out.println(c + "/" + b + "=" + a);
        }
        

    }
    
}
