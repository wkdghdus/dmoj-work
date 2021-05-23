/*
Luke Jang
2021-05-07
DMOPC '20 Contest 1 P1 - Victor Gets Quizzed
*/
import java.util.*;
import java.io.*;

public class victorQuiz {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String subject;
        char singleSubj;


        for (int i=0; i<n; i++){

        Boolean math = false;
        Boolean cs = false;

        subject = sc.next();

            for (int j = 0; j<5; j++){
                singleSubj = subject.charAt(j);
                if (singleSubj == 'M'){
                    math = true;
                }
                else if (singleSubj == 'C'){
                    cs = true;
                }
            
            }
        if ((math == true) && (cs == true)){
            System.out.println("NEGATIVE MARKS");
        }
        else if ((math == true) || (cs == true)){
            System.out.println("FAIL");
        }
        else{
            System.out.println("PASS");
        }

        }



    }
}