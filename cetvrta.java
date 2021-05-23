/*
Luke Jang
2021-05-17
COCI '07 Contest 1 #1 Cetvrta
*/

import java.util.*;
import java.io.*;

public class cetvrta {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] x = new int[3];
        int[] y = new int[3];

        for (int i = 0; i<3; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        if (x[0] == x[1]){
            System.out.print(x[2] + " ");
        }
        else if (x[0] == x[2]){
            System.out.print(x[1] + " ");
        }
        else {
            System.out.print(x[0] + " ");
        }

        if (y[0] == y[1]){
            System.out.print(y[2]);
        }
        else if (y[0] == y[2]){
            System.out.print(y[1]);
        }
        else {
            System.out.print(y[0]);
        } 


    }
    
}
