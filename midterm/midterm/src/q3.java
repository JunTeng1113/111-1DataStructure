import java.io.BufferedReader;
import java.io.InputStreamReader;

// q3. 生肖
public class q3 {
    public static void main(String[] args) throws Exception {
        String[] animal = {"rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep", "monkey", "rooster", "dog", "pig"};
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        int inputYear = Integer.parseInt(bfReader.readLine());
        System.out.println(animal[(inputYear + 8) % 12]);
    }

}
