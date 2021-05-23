/*
Luke Jang
2021-05-16
Appleby Contest '20 P1 - Terrific Triangles
*/
import java.util.*;
import java.io.*;

public class terrificTri {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[3];

        for (int j = 0; j<n; j++){

            for (int i = 0; i<3; i++){
    
                arr[i] = sc.nextInt();
    
            }
            
            Arrays.sort(arr);
    
            long a = arr[0];
            a = a * a;
            long b = arr[1];
            b = b*b;
            long c = arr[2];
            c = c*c;
    
            if (a+b==c){
                System.out.println("R");
            }
            else if(a+b>c){
                System.out.println("A");
            }
            else{
                System.out.println("O");
            }
        }

            
    }
}