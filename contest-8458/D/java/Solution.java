import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        int n;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            n = Integer.parseInt(reader.readLine());
        }
        generate(n, new char[n * 2], 0, 0);
    }

    private static void generate(int n, char[] str, int opened, int closed) {
        if (opened + closed == n * 2) {
            System.out.println(str);
            return;
        }
        if (opened < n) {
            str[opened + closed] = '(';
            generate(n, str, opened + 1, closed);
        }
        if (closed < opened) {
            str[opened + closed] = ')';
            generate(n, str, opened, closed + 1);
        }
    }

}