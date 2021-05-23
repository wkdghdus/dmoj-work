/*
Luke Jang
2021-05-17
Max Flow
*/
import java.util.*;
import java.io.*;

public class mazFlow {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();

        for (int i = 0; i<t; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j<n; j++){
                int asdf = sc.nextInt();
                arr[j] = asdf;
            }
            Arrays.sort(arr);
            System.out.println(arr[n-1]);
            

        }

    }

}
