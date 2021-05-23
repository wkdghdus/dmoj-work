/*
Luke Jang
2021-05-07
CCC '12 J1 - Speed fines are not fine!
*/

import java.util.*;
import java.io.*;


public class speedLimit {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int speed = sc.nextInt();

        int over = speed - limit;

        if (over<1){
            System.out.println ("Congratulations, you are within the speed limit!");
        }
        else if (over<= 20){ 
            System.out.println("You are speeding and your fine is $100.");
        }
        else if(over<=30) {
            System.out.println("You are speeding and your fine is $270.");
        }
        else{
            System.out.println("You are speeding and your fine is $500.");
        }


    }
}
