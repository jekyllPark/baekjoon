package day3.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 카드_합체_놀이_15903 {
    /*
     * https://www.acmicpc.net/problem/15903
     * */

    /*
    * 프로그래머스 하다 와서 그런지 백준 너무 불친절하다... 왜 틀렸는지 알기가 너무 힘들다..
    * 로직에 문제가 없는데 왜 자꾸 틀리지 해서 삽질 했더니 데이터 타입이 int여서 그랬다.. long으로 바꾸니 성공
    * 제한조건을 잘 살펴보고 어떤 값으로 반환할지 고민하자....
    *
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        long[] cards = new long[n];
        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            Arrays.sort(cards);
            long minSum = cards[0] + cards[1];
            System.out.println("minSum = " + minSum);
            cards[0] = minSum;
            cards[1] = minSum;
            System.out.println(Arrays.toString(cards));
        }

        long sum = Arrays.stream(cards).sum();

        System.out.println(sum);
    }
}
