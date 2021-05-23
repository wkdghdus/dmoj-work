/*
Luke Jang
2021-05-16
Hailstone Numbers
*/
import java.util.*;
import java.io.*;

public class hailstone {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;

        while (n != 1){
            

            if (n%2 == 1){
                n = n * 3 + 1;
                counter++;
            }
            else{
                n = n / 2;
                counter++;
            }

            //System.out.println(n);

            

        }
        System.out.println(counter);
        


    }

    
}
