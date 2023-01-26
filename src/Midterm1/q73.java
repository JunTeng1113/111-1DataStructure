
package Midterm1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// q73. 紙菸
public class q73 {
    public static void main(String[] args) throws Exception {
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("請輸入n: ");
        int n = Integer.parseInt(bfReader.readLine());
        System.out.print("請輸入k: ");
        int k = Integer.parseInt(bfReader.readLine());

        System.out.print(calc(n, k, 0));
    }
    public static int calc(int a, int b, int i) {
        if (a + (i / b) > 0) return a + (i / b) + calc((a / b), b, (i % b) + (a % b));
        return 0;
    }
}