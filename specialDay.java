/*
Luke Jang
2021-05-07
CCC '12 J1 - Speed fines are not fine!
*/

import java.util.*;
import java.io.*;


public class specialDay {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        
        if (month<2){
            System.out.println("Before");
        }
        else if (month>2){
            System.out.println("After");
        }
        else{

            if(day<18){
                System.out.println("Before");
            }
            else if (day>18){
                System.out.println("After");
            }
            else System.out.println("Special");

        }


    }
}
