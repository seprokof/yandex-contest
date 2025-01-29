import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int max = 0;
            int current = 0;
            for (int i = scanner.nextInt() - 1; i >= 0; i--) {
                if (scanner.nextInt() == 1) {
                    current++;
                } else {
                    max = Math.max(max, current);
                    current = 0;
                }
            }
            max = Math.max(max, current);
            System.out.println(max);
        }
    }
}