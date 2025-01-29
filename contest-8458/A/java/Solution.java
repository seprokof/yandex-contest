import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String j = scanner.nextLine();
            String s = scanner.nextLine();
            int result = 0;
            for (char ch : s.toCharArray()) {
                if (j.indexOf(ch) > -1) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }

}
