import java.util.*;
import java.io.*;

public class helloworld {
    public static void main(String[] args){
    
        /*You have trouble remembering which type of triangle is which. You write a program to help. 
        Your program reads in three angles (in degrees).

        If all three angles are 60, output Equilateral.
        If the three angles add up to 180 and exactly two of the angles are the same, output Isosceles.
        If the three angles add up to 180 and no two angles are the same, output Scalene.
        If the three angles do not add up to 180, output Error.
        */
        Scanner sc = new Scanner(System.in);

        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a+b+c;
        

        if(sum==180){
            if (a==b && a==c){
                System.out.println("Equilateral");
            }
            else if (a==b || a==c || c==b){
                System.out.println("Isosceles");
            }
            else {
                System.out.println("Scalene");
            }               
        }
        else{
            System.out.println("Error");
        }
    



    }
}
