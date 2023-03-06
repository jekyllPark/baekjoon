package day1;

import java.io.*;

public class BAEKJOON_4948{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean isPrime = false;

        StringBuilder sb = new StringBuilder();

        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;
            int count = 0;
            for(int i = n + 1; i <= 2 * n; i++){
                isPrime = primeCheck(i);
                if(isPrime == true) count++;
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
    public static boolean primeCheck(int n){
        if(n < 2) return false;
        else{
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0) return false;
            }
        }
        return true;
    }
}