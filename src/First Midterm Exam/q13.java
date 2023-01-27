
package Midterm1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// q13. 迴文問題
public class q13 {
    public static void main(String[] args) throws Exception {
        System.out.print("輸入一字元為: ");
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        String str1 = bfReader.readLine();
        String str2 = str1;
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(str1);
        stringbuilder.reverse();

        if (str2.equals(stringbuilder.toString())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
