/*
Luke Jang
2021-05-17
Equation Solver
*/
import java.util.*;
import java.io.*;


public class equationSolver {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ttl = sc.nextInt();
        int rn = 0;
        String oper;

        while(true){


            oper = sc.next();

            if (oper.equals("P")){
                rn = sc.nextInt();
                ttl += rn;
            }
            else if (oper.equals("M")){
                rn = sc.nextInt();
                ttl -= rn;
            }
            else{
                break;
            }
            


        }

        System.out.println(ttl);


    }
    
}
