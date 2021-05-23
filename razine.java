/*
Luke Jang
2021-05-17
COCI '10 Contest 6 #3 Razine
*/

import java.util.*;
import java.io.*;

public class razine {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int ini;
        int ttl = 0;
        Boolean works;

        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        while (true){

            for (int i = 0; i<n-1; i++){

                if (arr[i] >= arr [i+1]){
                    ini = arr[i];
                    arr[i] = arr[i+1] - 1; 
                    ttl = ttl + ini - arr[i];
                }

            }

            works = true;

            for (int i = 0; i<n-1; i++){

                if (arr[i] >= arr [i+1]){
                    works = false;
                }

            } 

            if (works == true){
                break;
            }

            


        }

        System.out.println(ttl);

    }
    
}
