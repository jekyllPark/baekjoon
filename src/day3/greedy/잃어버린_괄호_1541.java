package day3.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 잃어버린_괄호_1541 {
    /*
     * https://www.acmicpc.net/problem/1541
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = Integer.MAX_VALUE;
        System.out.println("ans = " + ans);
        String[] subtraction = br.readLine().split("-");
        System.out.println(Arrays.toString(subtraction));

        for (int i = 0; i < subtraction.length; i++) {
            int temp = 0;
            String[] addition = subtraction[i].split("\\+");

            System.out.println("addition array > " + Arrays.toString(addition));

            for (int j = 0; j < addition.length; j++) {
                temp += Integer.parseInt(addition[j]);
            }

            if (ans == Integer.MAX_VALUE) {
                ans = temp;
            } else {
                ans -= temp;
            }
            System.out.println("ans after = " + ans);
        }

        System.out.println(ans);
    }
}
