/*
Luke Jang
2021-05-19
COCI '09 Contest 7 #1 Spavanac
*/
import java.util.*;
import java.io.*;

public class spavanac {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minutes = sc.nextInt();

        int newMin = minutes - 45;

        if (newMin < 0){

            minutes = 60 + newMin;
            if (hour == 0){
                hour = 23;
            }
            else{
            hour -= 1;
            }
            
        }
        else{

            minutes = newMin;
        }

        System.out.println(hour + " " + minutes);



    }
}
