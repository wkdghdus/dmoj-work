/*
Luke Jang
2021-04-23 
CCC 2013 J1 
*/
import java.io.*;
import java.util.*;

public class Nextinline {
    
    public static void main(String[] args){
    /*You know a family with three children. Their ages form an arithmetic sequence: the difference in ages between the middle child and youngest child is the same as the difference in ages between the oldest child and the middle child. For example, their ages could be 5, 10 and 15, since both adjacent pairs have a difference of 5 years.

    Given the ages of the youngest and middle children, what is the age of the oldest child?*/

    Scanner sc = new Scanner(System.in);
    
    int age1 = sc.nextInt();
    int age2 = sc.nextInt();

    int diff = age2 - age1;

    System.out.println(age2+diff);

    
    
    
    
    
    
    
    }
}
