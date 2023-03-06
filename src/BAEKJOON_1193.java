import java.io.*;

public class BAEKJOON_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int blockCnt = 1;
        int sum = 0;

        while(true){
            if( X <= blockCnt + sum) {
                if(blockCnt % 2 == 0){
                    System.out.println(( X - sum ) + "/" + (blockCnt- ( X - sum - 1)));
                }else{
                    System.out.println(( blockCnt - ( X - sum - 1)) + "/" + (X - sum));
                }
                break;
            } else {
                sum += blockCnt;
                blockCnt++;
            }
            System.out.println("sum = " + sum);
            System.out.println("blockCnt = " + blockCnt);
        }
    }
}