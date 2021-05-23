/*
Luke Jang
2021-05-10
CCC '12 J2 - Sounds fishy!
*/

import java.util.*;
import java.io.*;

public class fish {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        Boolean rising = false;
        Boolean diving = false;
        Boolean equal = false;

        for (int i=0; i<4; i++){

            arr[i] = sc.nextInt();
        }

        if (arr[0]==arr[1]){

            for (int i=1; i<4; i++){

                if (arr [i] == arr [i-1]){
                    equal = true;
                }
                else{
                    equal = false;
                    break;
                }

            }

        }
        else if (arr[0] > arr[1]){

            for (int i=1; i<4; i++){

                if (arr [i] < arr [i-1]){
                    diving = true;
                }
                else{
                    diving = false;
                    break;
                }
                
            }

        }
        else{

            for (int i=1; i<4; i++){

                if (arr [i] > arr [i-1]){
                    rising = true;
                }
                else{
                    rising = false;
                    break;
                }
                
            }

        }

        if (equal==true){
            System.out.println("Fish At Constant Depth");
        }
        else if(diving==true){
            System.out.println("Fish Diving");
        }
        else if(rising == true){
            System.out.println("Fish Rising");
        }
        else System.out.println("No Fish");

    }
}