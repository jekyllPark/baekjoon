package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean isPrime;
        StringBuilder sb = new StringBuilder();
        for(int i = M; i <= N; i++){
            isPrime = primeCheck(i);
            if (isPrime == true){
                sb.append(i).append("\n");
            }
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
