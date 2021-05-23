/*
Luke Jang
2021-05-16
DWITE '07 R1 #2 - Cubes in a Pyramid
*/

import java.util.*;
import java.io.*;

public class pyramidCube {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        l = l * l;
        double h = sc.nextDouble();

        h = l * h / 3;

        System.out.println((int)Math.ceil(h));




    }
}
