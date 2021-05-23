/*
Luke Jang
2021-05-15
CCC '12 S1 - Don't pass me the ball!
*/
import java.util.*;
import java.io.*;

public class dontPass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n-1;
        int b = n-2;
        int c = n-3;


        System.out.println(a*b*c / 6);

        
        /*
        int number = sc.nextInt();
        int n = number - 1;
        int r = 3;
        int rFact = 1;
        int nFact = 1;
        int rnFact = 1;
        int base;
        int answer;

        //base
        for (int i=1; i <= r; i++){
            rFact = rFact * i;
        }

        //System.out.println("rFact: " + rFact);

        for (int i=1; i <= (n - r); i++){
            rnFact = rnFact * i;
        }

        //System.out.println("rnFact: " + rnFact);
        
        base = rnFact * rFact;

        //System.out.println("base: " + base);

        for (int i=1; i <= n; i++){
            nFact = nFact * i;
        }

        //System.out.println("nFact: " + nFact);

        answer = nFact / base;

        System.out.println (answer);
        */
        

        

    }
}
