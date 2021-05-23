/*
Luke Jang
2021-05-16
Primes
*/
import java.util.*;

public class prime {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Boolean notPrime = false;
        int counter = 0;

        for (int i = 2; i <= 541; i++){
            
            int num = i / 2;

            for (int j = 2; j<=num; j++){

                if (j != i){
                    if (i%j == 0){
                        notPrime = true;
                    }
                }

            }

            if (notPrime == false){
                counter++;
                System.out.println(i);
            }

            if (counter == n){
                break;
            }

            notPrime = false;


        }


        
    }    
}
