package day1;

import java.io.*;

public class BAEKJOON_11653{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if(N==1){

        }else{
            for( int i = 2; i <= N; i++){
                while(N % i == 0){
                    System.out.println(i);
                    N /= i;
                }
            }
        }
    }
}