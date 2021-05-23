import java.util.*;
import java.io.*;

public class contestTemplate {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] letter = new char[n];
        String s = sc.nextLine();
        char[] scannedCorrect = new char[n];
        Boolean alreadyScanned = false;
        int counter = 0;

        for (int i=0; i<n; i++){

            letter[i] = s.charAt(i);

        }

        ////checking the letters
        //base letter
        for (int i=0; i<n; i++){
            char x = letter[i];

            //checking if the base letter has any duplicating letter
            for (int j=i+1; j<n; j++){

                if (x == letter[j]){
                    counter++;
                    if 
                    break;
                    
                    

                }
                

            }


            

        }




    }
}
