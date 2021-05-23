/*
Luke Jang
2021-05-16
COCI '07 Contest 2 #2 Crne
*/

import java.util.*;
import java.io.*;

public class crne {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        int a =(int) Math.ceil(n/2.00);
        int b =(int) Math.floor(n/2.00);

        a++;
        b++;

        System.out.println(a*b);

    }
}
