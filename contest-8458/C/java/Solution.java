import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int size = Integer.parseInt(reader.readLine());
            if (size <= 0) {
                return;
            }
            int previous = Integer.parseInt(reader.readLine());
            System.out.println(previous);
            for (int i = 1; i < size; i++) {
                int current = Integer.parseInt(reader.readLine());
                if (current != previous) {
                    System.out.println(current);
                    previous = current;
                }
            }
        }
    }
}