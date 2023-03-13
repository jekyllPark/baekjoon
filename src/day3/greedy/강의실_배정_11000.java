package day3.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 강의실_배정_11000 {
    /*
     * https://www.acmicpc.net/problem/11000
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] lectures = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            lectures[i][0] = Integer.parseInt(st.nextToken());
            lectures[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(lectures, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            } else return a[0] - b[0];
        });
        System.out.println(Arrays.deepToString(lectures));

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(lectures[0][1]);

        for (int i = 1; i < N; i++) {
            if (pq.peek() <= lectures[i][0]) {
                pq.poll();
            }
            pq.offer(lectures[i][1]);
        }
        System.out.println("pq = " + pq);
        System.out.println(pq.size());

        br.close();
    }
}
