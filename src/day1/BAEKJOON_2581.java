package day1;

import java.io.*;

public class BAEKJOON_2581{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = Integer.MAX_VALUE;
        boolean isPrime = false;

        for(int i = M; i <= N; i++){
            isPrime = primeChk(i);
            if(isPrime == true){
                sum += i;
                if(min > i) {
                    min = i;
                }
            }
        }
        if(sum == 0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }

    public static boolean primeChk(int n){
        if( n < 2 ) return false;
        else if( n == 2 ) return true;
        else{
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}