/*
Luke Jang
2021-05-18
learning array list
*/
import java.util.*;
import java.io.*;

public class arrayListPrac {
    public static void main(String[] args){

        int n = 5;
  

        ArrayList<Integer> arrli = new ArrayList<Integer>(n);
  

        for (int i = 1; i <= n; i++)
            arrli.add(i);

        System.out.println(arrli);
  

        arrli.remove(3);

        
        arrli.add(3, 3);
  

        System.out.println(arrli);
  

        for (int i = 0; i < arrli.size(); i++)
            System.out.print(arrli.get(i) + " ");



    }
}
