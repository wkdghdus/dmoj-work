/*
Luke Jang
2021-05-15
CCC '11 J1 - Which Alien?
*/
import java.util.*;
import java.io.*;

public class alien {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if ((a>=3) && (b<=4)) System.out.println ("TroyMartian");
        if ((a<=6) && (b>=2)) System.out.println ("VladSaturnian");
        if ((a<=2) && (b<=3)) System.out.println ("GraemeMercurian");

    }
    
}
