/*
Luke Jang
2021-05-17
Sorting
*/
import java.util.*;
import java.io.*;

public class sorting {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i<n; i++){

            arr[i] = sc.nextInt();

        }

        Arrays.sort(arr);

        for (int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }

    }
}
