/*
Luke Jang
2021-05-15
COCI '10 Contest 2 #1 Puž
*/
import java.util.*;
import java.io.*;

public class puz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();
        int day = 0;
        int total = 0;

        
        for (int current = 0; current < V; current = current + A){

            if (current + B >= V){
                break;
            }
            current = current - B;
            day++;
        }
        
        System.out.println(day);


    }
}
