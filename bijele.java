/*
Luke Jang
2021-05-15
COCI '07 Contest 2 #1 Bijele
*/
import java.util.*;
import java.io.*;

public class bijele {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int king = sc.nextInt();
        System.out.print(1-king + " ");
        int queen = sc.nextInt();
        System.out.print(1-queen + " ");
        int rook = sc.nextInt();
        System.out.print(2-rook + " ");
        int bishops = sc.nextInt();
        System.out.print(2-bishops + " ");
        int knight = sc.nextInt();
        System.out.print(2-knight + " ");
        int pawn = sc.nextInt();
        System.out.print(8-pawn + " ");

    }
    
}
