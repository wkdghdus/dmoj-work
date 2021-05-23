/*
Luke Jang
2021-05-19
CCC '21 S1 - Crazy Fencing
*/

import java.util.*;
import java.io.*;

public class crazyFencing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        int[] height = new int[n+1];
        int[] base = new int[n];

        for (int i = 0; i<n+1; i++){

            height[i] = sc.nextInt();

        }

        for (int i = 0; i<n; i++){

            base[i] = sc.nextInt();

        }

        for (int i = 0; i<n; i++){

            double diff = Math.abs(height[i] - height[i+1]);
            double bigger = Math.max(height[i], height[i+1]);
            double asdf = bigger - diff;
            double asdf2 = diff * base[i];

            sum += asdf * base[i];
            sum += asdf2 / 2;
            
        }

        if (sum%1 == 0){
            System.out.println((int) sum);
        }
        else System.out.println(sum);

    }
}
