import java.util.*;
import java.io.*;

public class Pizza {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int pizza;
        int people;

        pizza = sc.nextInt();
        people = sc.nextInt();

        System.out.print((int)pizza/people + " ");
        System.out.println(pizza % people);

    }
}
