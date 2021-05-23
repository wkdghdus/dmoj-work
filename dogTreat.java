/*
Luke Jang
2021-05-15
CCC '20 J1 - Dog Treats
*/

import java.util.*;
import java.io.*;

public class dogTreat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt() * 2;
        int c = sc.nextInt() * 3;

        if (a+b+c >= 10) System.out.println("happy");
        else System.out.println("sad");

    }
}
