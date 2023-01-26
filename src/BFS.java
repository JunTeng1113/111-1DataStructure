import java.util.LinkedList;
import java.util.Queue;

// week 16
// 利用ChatGPT產生BFS
// Author: ChatGPT
public class BFS {
    public void bfs(int s, int[][] arr, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");

            for (int i = 0; i < arr.length; i++) {
                if (arr[s][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS bfs = new BFS();
        int[][] arr = {{0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 0, 1}, {0, 0, 0, 0}};
        boolean[] visited = new boolean[arr.length];
        bfs.bfs(2, arr, visited);
    }
}
