/*
Luke Jang
2021-05-17
DMOPC '14 Contest 2 P1 - Logging Log
*/
import java.util.*;
import java.io.*;

public class loggingLog {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int d = sc.nextInt();

        for (int i = 1; i<=d; i++){
            int t = sc.nextInt();
            int m = 0;
            for (int j = 0; j<t; j++){
                int asdf = sc.nextInt();
                
                m += asdf;

            }

            if (m != 0) System.out.println("Day " + i + ": " + m);
            else System.out.println("Weekend");

        }



    }
}
