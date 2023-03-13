package day4.greedy.review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 로프_2217 {
    /*
    * https://www.acmicpc.net/problem/2217
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] ropes = new int[N];

        for (int i = 0; i < N; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ropes);

        int ans = ropes[0] * ropes.length; // 최소 지탱 무게 > 20
        for (int i = 0; i < ropes.length; i++) {
            int w = ropes[i] * (ropes.length - i); // 최대 지탱 무게 갱신 > 15 * 1 = 15
            if (w > ans) { // 15 > 20 = false > ans = 20;
                ans = w;
            }
        }
        System.out.println(ans);
    }
}
