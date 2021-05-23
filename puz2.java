/*
Luke Jang
2021-05-15
COCI '10 Contest 2 #1 Puž
time limit fix
*/

import java.util.*;
import java.io.*;
public class puz2{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[]args)throws IOException { 
        
        int A = readInt();
        int B = readInt();
        int V = readInt();
        int day = 0;
        int total = 0;

        
        for (int current = 0; current < V; current = current + A){

            if (current + B >= V){
                break;
            }
            current = current - B;
            day++;
        }
        
        System.out.println(day);

        
        
    }
    static String next () throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static long readLong () throws IOException {
        return Long.parseLong(next());
    }
    static int readInt () throws IOException {
        return Integer.parseInt(next());
    }
    static double readDouble () throws IOException {
        return Double.parseDouble(next());
    }
    static char readChar () throws IOException {
        return next().charAt(0);
    }
    static String readLine () throws IOException {
        return br.readLine().trim();
    }
}
