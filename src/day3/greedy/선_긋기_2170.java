package day3.greedy;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 선_긋기_2170 {
    /*
    * https://www.acmicpc.net/problem/2170
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] lines = new int[N][2];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            lines[i][0] = Integer.parseInt(st.nextToken());
            lines[i][1] = Integer.parseInt(st.nextToken());
        }

        System.out.println(Arrays.deepToString(lines));
        Arrays.sort(lines, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            else return a[0] - b[0];
        });
        System.out.println(Arrays.deepToString(lines));
        int prevStart = lines[0][0];
        int prevEnd = lines[0][1];
        int ans = prevEnd - prevStart;
        System.out.println("ans in first condition = " + ans);
        for (int i = 1; i < N; i++) {
            // 1 <= 2 && 5 <= 3
            if(prevStart <= lines[i][0] && lines[i][1] <= prevEnd) { // pass > prev가 2, 5 / 현재 3, 5
                continue;
            } else if (lines[i][0] < prevEnd) { // 2 < 3
                ans += lines[i][1] - prevEnd; // 5 - 3 = 2 >> 기존 2 + 2 = 4
            } else {
                ans += lines[i][1] - lines[i][0];
            }
            prevStart = lines[i][0]; // 2
            prevEnd = lines[i][1]; // 5
        }

        System.out.println(ans);
        br.close();
    }
}
