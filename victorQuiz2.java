/*
Luke Jang
2021-05-07
DMOPC '20 Contest 1 P1 - Victor Gets Quizzed
learnt .contains("")
*/

import java.util.*;
import java.io.*;

public class victorQuiz2 {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    String quiz;

    for (int i=0; i<num; i++ ){
        quiz = sc.next();

        if ((quiz.contains("M")) && (quiz.contains("C"))){
            System.out.println("NEGATIVE MARKS");
        }
        else if ((quiz.contains("M")) || (quiz.contains("C"))){
            System.out.println("FAIL");
        }
        else{
            System.out.println("PASS");
        } 
    }
    
    
    }
}