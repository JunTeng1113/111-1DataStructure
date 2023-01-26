
package Midterm1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// q5. 階層判斷
public class q5 {
    public static void main(String[] args) throws Exception {
        System.out.print("請輸入階乘值 M: ");
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(bfReader.readLine());
        int N = 0;
        int num = 1;
        while (num < M) {
            N += 1;
            num *= N;
        }
        System.out.println("超過 M 為 " + M + " 的最小階層 N 值為：" + N);
    }

}
