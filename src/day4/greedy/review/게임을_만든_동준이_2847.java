package day4.greedy.review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 게임을_만든_동준이_2847 {
    /*
    * https://www.acmicpc.net/problem/2847
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] levels = new int[N];
        for (int i = 0; i < N; i++) {
            levels[i] = Integer.parseInt(br.readLine());
        }

        int prev = levels[levels.length - 1];
        int ans = 0;

        for (int i = N - 2; i >= 0; i--) {
            if (levels[i] >= prev) {
                int needToMinus = Math.abs(levels[i] - prev) + 1;
                levels[i] = levels[i] - needToMinus;
                ans += needToMinus;
            }
            prev = levels[i];
        }
        System.out.println(ans);
    }
}
