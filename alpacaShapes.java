/*
Luke Jang
2021-05-07
An Animal Contest 1 P1 - Alpaca Shapes
*/

import java.util.*;
import java.io.*;

public class alpacaShapes {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double side = sc.nextInt();
        double radius = sc.nextInt();


        radius = Math.pow(radius, 2) * 3.14;
        side = Math.pow(side, 2);

        if (side>radius){
            System.out.println("SQUARE");
        }
        else System.out.println("CIRCLE");
    }
    
}
