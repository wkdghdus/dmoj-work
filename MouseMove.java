/*
Luke Jang
2021-05-04
CCC '05 S2 - Mouse Move

*/

import java.util.*;
import java.io.*;

public class MouseMove{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int r = sc.nextInt();

        int x = 0;
        int y = 0;

        int n;
        int m;

        while (true){

            n = sc.nextInt();
            m = sc.nextInt();


            if ((n == 0) && (m == 0))break;

            x = n + x;
            y = m + y;

            if (x<0){
                x = 0;
            }
            else if (x>c){
                x = c;
            }

            if (y<0){
                y = 0;
            }
            else if (y>r){
                y = r;
            }


            
            System.out.println(x + " " + y);





        }
        


    }
}