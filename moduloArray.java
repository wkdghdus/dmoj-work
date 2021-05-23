/*
Luke Jang
2021-05-01
COCI '06 Contest 1 #1 Modulo

*/
import java.util.*;
import java.io.*;

public class moduloArray{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n;
        int counter = 0;

        Boolean[] arr = new Boolean[42];

        for (int i=0; i<42; i++){

            arr[i] = false;
        }

        for (int i=0; i<10; i++){

            n = sc.nextInt();

            n = n%42;

            arr[n] = true;
        }

        for (int i=0; i<42; i++){
            
            if (arr[i]==true) counter++;

        }

        System.out.println(counter);
        
    }
}