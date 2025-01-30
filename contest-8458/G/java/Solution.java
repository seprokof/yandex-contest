import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[][] graph = new int[n][];
            for (int i = 0; i < n; i++) {
                graph[i] = new int[] { scanner.nextInt(), scanner.nextInt() };
            }
            int k = scanner.nextInt();
            int start = scanner.nextInt() - 1;
            int end = scanner.nextInt() - 1;

            boolean[] visited = new boolean[n];
            Queue<int[]> queue = new LinkedList<>();
            queue.add(new int[] { graph[start][0], graph[start][1], 0 });
            visited[start] = true;
            while (!queue.isEmpty()) {
                int[] city = queue.poll();
                if (city[0] == graph[end][0] && city[1] == graph[end][1]) {
                    System.out.println(city[2]);
                    return;
                }
                for (int i = 0; i < n; i++) {
                    if (visited[i]) {
                        continue;
                    }
                    int[] nextCity = graph[i];
                    long distance = Math.abs((long) city[0] - nextCity[0]) + Math.abs((long) city[1] - nextCity[1]);
                    if (distance <= k) {
                        queue.offer(new int[] { nextCity[0], nextCity[1], city[2] + 1 });
                        visited[i] = true;
                    }
                }
            }
            System.out.println(-1);
        }
    }

}