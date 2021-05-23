/*
Luke Jang
2021-05-19
VPEX P1 - War on Two Fronts
*/
import java.util.*;
import java.io.*;

public class warOnTwoFronts {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int[] arr2 = new int[5];

        for (int i = 0 ; i<5; i++ ){
            arr[i] = sc.nextInt();
            

        }

        for (int i = 0 ; i<5; i++ ){
            arr2[i] = sc.nextInt();
            
        }
        Arrays.sort(arr);
        Arrays.sort(arr2);
        int sum = 0;
        int sum2 = 0;

        for (int i = 1; i<5; i++){

            sum += arr[i];
            sum2 += arr2[i];
        }

        if (sum>sum2) System.out.println(sum);
        else System.out.println(sum2);
    }
}
