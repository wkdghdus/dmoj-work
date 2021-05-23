/*
Luke Jang
2021-04-23
CCC 2008 J1
*/
import java.io.*;
import java.util.*;

public class BodyMassIndex {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        double weight = sc.nextDouble();
        double height = sc.nextDouble();

        double bmi = weight/(height*height);
        
        if(bmi>25){
            System.out.println("Overweight");
        }
        else if (bmi<18.5){
            System.out.println("Underweight");
        }
        else {
            System.out.println("Normal weight");
        }


        /*

        Math.pow(2,4); //16.0
        Math.sqrt(64); //8.0
        Math.abs(-5); //5
        Math.ceil(3.001) //4.0
        Math.floor(3.999) //3.0
        



        */
    }
}
