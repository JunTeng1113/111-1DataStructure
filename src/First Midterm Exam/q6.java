
package Midterm1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// q6. 兩數差值
public class q6 {
    public static void main(String[] args) throws Exception {
        System.out.print("輸入值為: ");
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        String input  = bfReader.readLine();
        StringBuilder stringbuilder = new StringBuilder();
        int[] val = Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).toArray(); 
        // System.out.println("超過 M 為 " + M + " 的最小階層 N 值為：" + N);
    }

}
