package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(factorial(Integer.parseInt(br.readLine())));
    }
    public static int factorial(int n){
        if(n <= 1) return 1;
        return n * factorial(n-1);
    }
}
