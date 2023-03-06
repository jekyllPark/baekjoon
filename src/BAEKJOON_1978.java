import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        boolean isPrime;
        int count = 0;
        while(st.hasMoreTokens()){
            int i = Integer.parseInt(st.nextToken());
            isPrime = primeChk(i);
            if(isPrime == true){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean primeChk(int n){
        if(n < 2) return false;
        else if(n == 2) return true;
        else{
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0) return false;
            }
        }
        return true;
    }
}
