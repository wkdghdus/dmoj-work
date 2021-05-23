/*
Luke Jang
2021-05-01
DMOPC '17 Contest 3 P1 - An Early Christmas Present
*/

import java.util.*;
import java.io.*;

public class earlyChristmasPresent{
    
    public static void main(String[] agrs){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i=0; i<n;i++){

            arr[i] = sc.nextInt();

        }

        Arrays.sort(arr);

        System.out.println(arr[0]);

    }
}