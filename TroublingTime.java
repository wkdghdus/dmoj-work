/*
Luke Jang
2021-04-30
*/

import java.util.*;
import java.io.*;

public class TroublingTime{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n;
        int d;
        int x;
        int y = -1;

        n = sc.nextInt();
        d = sc.nextInt();

        d = Math.abs(d);

        for (int i = 0; i < n; i++){

            x = sc.nextInt();

            if (d%x == 0) y = Math.max(x,y); 


        }

        if (y == -1){
            System.out.println("This is not the best time for a trip.");
        }
        else{
            System.out.println(d/y);
        }
    }
}