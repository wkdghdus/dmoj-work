/*
Luke Jang
2021-05-07
*/
import java.util.*;
import java.io.*;

public class shiftySum {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int shifts;
        int sum = 0;

        for (int i=0; i<=k; i++){

            shifts = (int) Math.pow(10, i) * n;
            sum = sum + shifts;

        }

        System.out.println(sum);
        



    }

}
