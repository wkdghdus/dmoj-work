/*
Luke Jang
2021-05-10
An Animal Contest 2 P1 - Koala Konundrum
failed contest problem
*/

import java.util.*;
import java.io.*;

public class koalaKonundrum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int[] arr = new int[26];
        char currentLetter;
        int counter = 0;

        for (int i = 0; i<n; i++){
            currentLetter = s.charAt(i);
            arr[(int)currentLetter - 97]++;

        }

        for (int i = 0; i<26; i++){
            if (arr[i] % 2 == 1){
                counter++;
            }
        }

        if (counter == 0){
            counter++;
        }

        System.out.println(counter);
        
        

    }
}