/*
Luke Jang
2021-05-19
COCI '15 Contest 7 #1 NIZOVI
*/
import java.util.*;
import java.io.*;


public class nizovi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String asdf = sc.nextLine();
        int indent = 0;

        for (int i = 0 ; i<asdf.length(); i++){
            char wkdghdus = asdf.charAt(i);

            if (wkdghdus == '{'){
                for (int j = 0; j<indent; j++){
                    System.out.print("  ");
                }
                System.out.println(wkdghdus);
                indent += 1;
            }
            else if (wkdghdus == '}'){
                indent -= 1;
                if ((asdf.charAt(i-1) != '{') || asdf.charAt(i-1) != ','){
                    System.out.println("");
                }
                for (int j = 0; j<indent; j++){
                    System.out.print("  ");
                }
                System.out.println(wkdghdus);

            }
            else if (wkdghdus == ','){

                System.out.println(wkdghdus);
                
                if ((asdf.charAt(i+1)!='}') || (asdf.charAt(i+1)!='{'))
                for (int j = 0; j<indent; j++){
                    System.out.print("  ");
                }
            }
            else{
                System.out.print(wkdghdus);
            }


            



        }

    }    
}
