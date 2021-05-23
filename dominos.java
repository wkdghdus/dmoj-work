/*
Luke Jang
2021-05-17
COCI '09 Contest 1 #2 Domino
*/
import java.util.*;
import java.io.*;

public class dominos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        int asdf = 0;
        for (int i = 0; i<=n; i++){
            for (int j = 0 + asdf; j<=n; j++){
                counter++;

                //System.out.print(" " + i + "|" + j );
            }
            asdf++;
        }
        
        System.out.println (counter * n);

    }

}

