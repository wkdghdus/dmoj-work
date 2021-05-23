/*
Luke Jang
2021-05-01
Find tiles that can fit into the given width and length
*/

import java.util.*;
import java.io.*;

public class tiles {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int tiles, width, length, num;

        width = sc.nextInt();
        length = sc.nextInt();

        tiles = sc.nextInt();

        width = (int) width/tiles;
        length = (int) length/tiles;

        num = width * length;

        System.out.println(num);


        

    }
}
