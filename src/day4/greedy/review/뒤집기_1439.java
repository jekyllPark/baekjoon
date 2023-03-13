package day4.greedy.review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 뒤집기_1439 {
    /*
     * https://www.acmicpc.net/problem/1439
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        Map<Character, Integer> map = new HashMap<>();

        char prev = S.charAt(0);
        if (prev == '0') {
            map.put('0', 1);
        } else {
            map.put('1', 1);
        }

        for (int i = 1; i < S.length(); i++) {
            if (prev != S.charAt(i)) {
                map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
            }
            prev = S.charAt(i);
        }

        Integer zero = map.get('0') == null ? 0 : map.get('0');
        Integer one = map.get('1') == null ? 0 : map.get('1');
        int ans = Math.min(zero, one);
        System.out.println(ans);
    }
}
