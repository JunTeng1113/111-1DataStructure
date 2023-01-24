import java.io.BufferedReader;
import java.io.InputStreamReader;

// q9. 字根與子字串
public class q9 {
    public static void main(String[] args) throws Exception {
        System.out.print("輸入 s1 為: ");
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        String str1 = bfReader.readLine();
        System.out.print("\n輸入 s2 為: ");
        String str2 = bfReader.readLine();
        if (str2.replace(str1, "").length() != str2.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
