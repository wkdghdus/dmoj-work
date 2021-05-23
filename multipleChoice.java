/*
Luke Jang
2021-05-07
CCC '11 S2 - Multiple Choice
*/

import java.util.*;
import java.io.*;

public class multipleChoice {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ansCount = 0;
        String[] student = new String[n];
        String[] answer = new String[n];


        for (int i=0; i<n; i++){
            student[i] = sc.next();
        }
        
        for (int i=0; i<n; i++){
            answer[i] = sc.next();
        }

        for (int i=0; i<n; i++){
            if (answer[i].equals(student[i])){
                ansCount++;
            }
        }

        System.out.println(ansCount);
        

    }
}

