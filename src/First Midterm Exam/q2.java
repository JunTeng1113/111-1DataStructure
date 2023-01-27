
package Midterm1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// q2. 計算電費
public class q2 {
    public static void main(String[] args) throws Exception {
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bfReader.readLine());

        int powerAmount = input;
        double summer_fee = 0;
        double non_summer_fee = 0;
        int[] power = {700 , 500 , 330 , 120 , 0};
        double[] summer = {5.63, 4.97, 4.39, 3.02, 2.10};
        double[] non_summer = {4.50, 4.01, 3.61, 2.68, 2.10};
        for (int i = 0; i < 5; i++) {
            if (powerAmount > power[i]) {
                int temp = powerAmount - power[i];
                powerAmount = power[i];
                summer_fee += temp * summer[i];
                non_summer_fee += temp * non_summer[i];
            }
        }

        System.out.println("Summer months:" + summer_fee);
        System.out.println("Non-Summer months:" + non_summer_fee);
    }

}
