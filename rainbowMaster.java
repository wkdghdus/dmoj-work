/*
Luke Jang
2021-05-16
Valentine's Day '19 J1 - Rainbow Rating

*/
import java.util.*;
import java.io.*;

public class rainbowMaster {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rating;

        for (int i = 0; i < n; i++){

            rating = sc.nextInt();

            if (rating < 1000) System.out.println("Newbie");
            else if (rating < 1200) System.out.println("Amateur");
            else if (rating < 1500) System.out.println("Expert");
            else if (rating < 1800) System.out.println("Candidate Master");
            else if (rating < 2200) System.out.println("Master");
            else if (rating < 3000) System.out.println("Grandmaster");
            else if (rating < 4000) System.out.println("Target");
            else System.out.println("Rainbow Master");

        }
        

    }   
}
