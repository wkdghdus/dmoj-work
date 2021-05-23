/*
Luke Jang
2021-05-15 ~ 16
COCI '10 Contest 2 #1 Puž
TLE fix 2nd try
*/
import java.util.*;
import java.io.*;

public class puz3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();
        double diff = A - B;
        int day = 0;
        double asdf = V - A;

        day =(int) Math.ceil(asdf / diff);
        day++;


        
        
        
        System.out.println(day);


    }
}
