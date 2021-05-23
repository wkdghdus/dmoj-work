/*
Luke Jang
2021-05-14
GFSSOC '17 J2 - Admission Average
*/

import java.util.*;
import java.io.*;

public class admissionAverage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] grade = new int[6];
        int sum = 0;
        int aif;
        int requirement;

        for (int i = 0; i < 6; i++){
            grade[i] = sc.nextInt();
            sum = sum + grade[i];
        }

        sum = sum/6;

        aif = sc.nextInt();

        sum = sum + aif;

        requirement = sc.nextInt();

        if (sum >= requirement){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
}