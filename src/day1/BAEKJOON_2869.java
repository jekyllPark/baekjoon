package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());

        int day = (length-down) / (up-down); // ex 3 1 13 이라면  -> 13 - 1 / 3 - 1 = 6

        if((length - down) % (up - down) != 0){ // 12 / 2 == 0
            day++;
        }

        System.out.println(day);
    }
}