package day3.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 회의실_배정_1931 {
    /*
     * https://www.acmicpc.net/problem/1931
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] meetings = new int[N][2];
        StringTokenizer st;
        int ans = 1;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            meetings[i][0] = Integer.parseInt(st.nextToken());
            meetings[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(meetings, (a, b) -> {
            if (a[1] == b[1]) {
                return a[0] - b[0];
            }
            else return a[1] - b[1];
        });

        int prevEndTime = meetings[0][1];

        System.out.println(Arrays.deepToString(meetings));

        for (int i = 1; i < N; i++) {
            if (prevEndTime <= meetings[i][0]) {
                prevEndTime = meetings[i][1];
                ans++;
            }
        }

        System.out.println("ans = " + ans);

    }
}
