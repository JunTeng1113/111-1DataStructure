import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q1 {
    public static void main(String[] args) throws Exception {
        System.out.print("請輸入正整數：");
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input_array  = bfReader.readLine().split("");
        StringBuilder stringbuilder = new StringBuilder();
        int numList = 0;
        for (int i = 0; i < input_array.length; i++) {
            for (int j = i; j < input_array.length; j++) {
                stringbuilder.append(input_array[j]);
                int temp = Integer.parseInt(stringbuilder.toString());
                if (isPrime(temp) && temp > numList) {
                    numList = temp; 
                }
            }
            stringbuilder.setLength(0);
        }
        String answer = Integer.toString(numList);
        if (numList == 0) answer = "No Prime Found";
        System.out.println("子字串中最大的質數值為：" + answer);
    }

    public static boolean isPrime(int number){
        for (int i = 2; i < Math.pow(number, 0.5)+1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
