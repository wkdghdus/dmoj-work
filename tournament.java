/*
Luke Jang
2021-05-07
CCC '16 J1 - Tournament Selection
*/
import java.util.*;
import java.io.*;

public class tournament {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int wins = 0;
        String result;

        for (int i=0; i<6; i++){
            result = sc.nextLine();
            
            if (result.equals("W")){
                wins++;
            }

        }

        if (wins == 0){
            System.out.println("-1");
        }
        else if ((wins == 1) || (wins == 2)){
            System.out.println("3");
        }
        else if ((wins == 3) || (wins == 4)){
            System.out.println("2");
        }
        else System.out.println("1");
    }
}
