/*
Luke JAng
2021-05-14
DMOPC '19 Contest 6 P0 - Trivial Math
*/
import java.util.*;
import java.io.*;

public class triviaMath {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((a < b + c) && (b < a + c) && (c < b + a)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }



        
    }
}
