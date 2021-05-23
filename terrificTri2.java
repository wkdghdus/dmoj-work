/*
Luke Jang
2021-05-16
Appleby Contest '20 P1 - Terrific Triangles
*/
import java.util.*;
import java.io.*;

public class terrificTri2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[3];

        for (int j = 0; j<n; j++){

            arr = in.readLine().split(" "); 

    
            int a = Integer.parseInt(arr[0]); 
            a = a * a;
            int b = Integer.parseInt(arr[1]);
            b = b * b;
            int c = Integer.parseInt(arr[2]);
            c = c* c;
    
            if (a+b==c){
                System.out.println("R");
            }
            else if(a+b>c){
                System.out.println("A");
            }
            else if(a+b<c){
                System.out.println("O");
            }
        }

            
    }
}



