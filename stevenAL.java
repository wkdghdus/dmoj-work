/*
Luke Jang
2021-05-18
Steven's arraylist problem
*/

import java.util.*;
import java.io.*;


public class stevenAL {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<Integer>(n);

        for (int i=0; i<n; i++){
            
            al.add(sc.nextInt());

        }

        int q = sc.nextInt();
        int a;
        int b;

        for (int i = 0; i<q; i++){

            a = sc.nextInt();
            b = sc.nextInt();

            if (a == 1){

                al.add(b);

            }
            else{

                for (int j = 0; j<al.size(); j++){
                    if (al.get(j) == b){
                        
                        al.remove(j);
                        break;

                    }
                }
            }

        }


        for (int i : al) System.out.print(i + " ");

    }    
}
