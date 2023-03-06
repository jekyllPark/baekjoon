import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON_9020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        boolean isPrime;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++){
            int n = Integer.parseInt(br.readLine());
            int firstPartition = n / 2;
            int secondPartition = n / 2;

            while(true){
                if(primeChk(firstPartition) == true && primeChk(secondPartition) == true){
                    sb.append(firstPartition).append(" ").append(secondPartition).append("\n");
                    break;
                }else{
                    firstPartition--;
                    secondPartition++;
                }
            }

        }
        System.out.println(sb);
    }
    public static boolean primeChk(int n){
        if(n < 2) return false;
        else{
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0) return false;
            }
        }
        return true;
    }
}
