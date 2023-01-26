
// week 16
// 利用ChatGPT產生DFS
// Author: ChatGPT
public class DFS {
    public void dfs(int s, int[][] arr, boolean[] visited) {
        visited[s] = true;
        System.out.print(s + " ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[s][i] == 1 && !visited[i]) {
                dfs(i, arr, visited);
            }
        }
    }
        
    public static void main(String[] args) {
        DFS dfs = new DFS();
        int[][] arr = {
            {0, 1, 1, 0}, 
            {0, 0, 0, 1}, 
            {1, 0, 0, 1}, 
            {0, 0, 0, 0}
        };
        boolean[] visited = new boolean[arr.length];
        dfs.dfs(2, arr, visited);
    }
}
