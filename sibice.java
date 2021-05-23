/*
Luke Jang
2021-05-15
COCI '06 Contest 4 #1 Sibice
*/
import java.util.*;
import java.io.*;

public class sibice {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int asdf;

        w = w*w;
        h = h*h;

        double num = Math.sqrt(w + h);
        
        for (int i=0; i<n; i++){
            asdf = sc.nextInt();

            if (asdf<=num)System.out.println("DA");
            else System.out.println("NE");

        }



    }    
}
