package day2.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 뒤집기_1439 {
    /*
     * https://www.acmicpc.net/problem/1439
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        boolean flag = true;
        char prev = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (prev != str.charAt(i)) flag = false;
        }

        /*
         * 0과 1중 연속 된 수의 그룹의 개수를 비교해서 보다 적은 놈을 리턴하면 됨.
         * */
        if (flag) System.out.println(0);
        else {
            boolean isZero = str.charAt(0) == '0' ? true : false;
            int oneCnt = isZero ? 0 : 1;
            int zeroCnt = isZero ? 1 : 0;
            for (int i = 1; i < str.length(); i++) {
                if (prev != str.charAt(i)) {
                    if (isZero) {
                        oneCnt++;
                        isZero = false;
                    } else {
                        zeroCnt++;
                        isZero = true;
                    }
                }
                prev = str.charAt(i);
            }
            System.out.println("oneCnt = " + oneCnt);
            System.out.println("zeroCnt = " + zeroCnt);

            System.out.println(Math.min(oneCnt, zeroCnt));
        }
    }
}
