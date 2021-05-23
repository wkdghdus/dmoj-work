/*
Luke Jang
2021-05-17
COCI '16 Contest 1 #1 Tarifa
*/

import java.util.*;
import java.io.*;

public class tarifa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ini = x;
        int n = sc.nextInt();
        int asdf;

        for (int i = 0; i<n; i++){
            asdf = sc.nextInt();
            x = x - asdf;
            x = x + ini;

        }

        System.out.println(x);

    }
}
