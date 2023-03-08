package day2.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 게임을_만든_동준이_2847 {
    /*
     * https://www.acmicpc.net/problem/2847
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        int ans = 0;

        int curr = list.get(list.size() - 1);
        for (int i = list.size() - 2; i >= 0; i--) { // 3 5 5 7
            if (curr > list.get(i)) {
                curr = list.get(i);
            } else {
                int gap = Math.abs(list.get(i) - curr) + 1;
                curr = list.get(i) - gap;
                ans += Math.abs(gap);
            }
        }
        System.out.println(ans);
    }
}
