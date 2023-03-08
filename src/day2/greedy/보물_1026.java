package day2.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 보물_1026 {
    /*
     * https://www.acmicpc.net/problem/1026
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st1.nextToken());
        }
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(A);
        Arrays.sort(B);
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));

        int answer = 0;
        for (int i = 0; i < N; i++) {
            answer += A[i] * B[N - 1 - i];
        }

        System.out.println(answer);

        br.close();
    }
}
