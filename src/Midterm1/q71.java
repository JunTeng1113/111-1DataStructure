
package Midterm1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// q71. 轉換3進位
public class q71 {
    public static void main(String[] args) throws Exception {
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("請輸入十進位的正整數: ");
        int i = Integer.parseInt(bfReader.readLine());

        System.out.print(i + "的三進位是" + toThree(i));
    }
    public static int toThree(int n) {
        if (n / 3 > 0) return Integer.toString(toThree(n / 3)) + Integer.toString(n % 3);
        return 0;
    }
}