package day4.greedy.review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 동전_0_11047 {
    /*
    * https://www.acmicpc.net/problem/11047
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] coins = new int[N];
        for (int i = 0; i < coins.length; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(coins);
        int ans = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            if (coins[i] <= K && K >= 0) {
                ans += K / coins[i];
                K %= coins[i];
            }
        }
        System.out.println(ans);
    }
}
