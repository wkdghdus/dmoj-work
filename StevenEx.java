import java.util.*;
import java.io.*;


public class StevenEx {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int max = 0;
        int num;

        while (true){
            num = sc.nextInt();
            max = Math.max(num, max);

            System.out.println(max);
        }
        



    }
}
