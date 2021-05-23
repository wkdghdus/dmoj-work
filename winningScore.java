/*
Luke Jang
2021-05-02
CCC '19 J1 - Winning Score
*/

import java.util.*;
import java.io.*;

public class winningScore {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] apple = new int[3];
        int[] banana = new int[3];
    
        int aScore;
        int bScore;

        for (int i=0; i<3; i++){
            apple[i] = sc.nextInt();
        }

        for (int i=0; i<3; i++){
            banana[i] = sc.nextInt();
        }

        aScore = (apple[0] * 3) + (apple[1] * 2) + apple[2];
        bScore = (banana[0] * 3) + (banana[1] * 2) + banana[2];

        if (aScore > bScore){
            System.out.println("A");
        }
        else if(bScore > aScore){
            System.out.println("B");
        }
        else{
            System.out.println("T");
        }
        
    
    
    }
}
