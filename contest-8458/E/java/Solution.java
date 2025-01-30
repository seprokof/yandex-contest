import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String one = reader.readLine();
            String two = reader.readLine();
            if (one.length() != two.length()) {
                System.out.println(0);
                return;
            }
            int[] dictionary = new int[26];
            for (char ch : one.toCharArray()) {
                dictionary[ch - 'a']++;
            }
            for (char ch : two.toCharArray()) {
                dictionary[ch - 'a']--;
            }
            for (int v : dictionary) {
                if (v != 0) {
                    System.out.println(0);
                    return;
                }
            }
            System.out.println(1);
        }
    }

}