package day4.greedy.review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ATM_11399 {
    /*
    * https://www.acmicpc.net/problem/11399
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] time = new int[N];
        for (int i = 0; i < N; i++) {
            time[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(time);
        int ans = 0;
        int temp = 0;
        for (int i = 0; i < time.length; i++) {
            temp += time[i];
            ans += temp;
        }
        System.out.println(ans);
    }
}
