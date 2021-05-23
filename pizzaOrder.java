/*
Luke Jang
2021-05-14
DMPG '18 B1 - Pizza Orders
*/

import java.util.*;
import java.io.*;

public class pizzaOrder {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        double p = sc.nextInt();
        double c = sc.nextInt();
        double v = sc.nextInt();



        p = Math.ceil(p/3);
        c = Math.ceil(c/3);
        v = Math.ceil(v/3);
        
        double sum =  p + c + v;
        System.out.println((int)sum);
    }

}
