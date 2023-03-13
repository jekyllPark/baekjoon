package day3.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 주식_11501 {
    /*
     * https://www.acmicpc.net/problem/11501
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        long ans[] = new long[T];
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), " ");
            long stocks[] = new long[N];
            for (int j = 0; j < N; j++) {
                stocks[j] = Long.parseLong(st.nextToken());
            }
            long max = 0;
            for (int k = N - 1; k >= 0; k--) {
                if (stocks[k] > max) {
                    max = stocks[k];
                } else {
                    ans[i] += (max - stocks[k]);
                }
            }
        }
        for (long i : ans) {
            System.out.println(i);
        }
    }
}
