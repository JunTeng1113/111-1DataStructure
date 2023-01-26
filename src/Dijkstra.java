import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

// 第16週 20221228_Dijkstra
// 列出所有點與點之間的最短路線長度
public class Dijkstra {
    
    static class Edge {
        int to, weight;
        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    
    public static int[] dijkstra(Graph graph, int source) {
        
        int[] dist = new int[graph.V];
        
        Arrays.fill(dist, Integer.MAX_VALUE);
        
        dist[source] = 0;
    
        
        PriorityQueue<Edge> heap = new PriorityQueue<>((a, b) -> a.weight - b.weight);
        heap.offer(new Edge(source, 0));
    
        while (!heap.isEmpty()) {
            
            Edge edge = heap.poll();
            int u = edge.to;
            int w = edge.weight;
    
            
            if (w > dist[u]) {
                continue;
            }
    
            
            for (Edge e : graph.adj.get(u)) {
                int v = e.to;
                int newW = w + e.weight;
                if (newW < dist[v]) {
                    dist[v] = newW;
                    heap.offer(new Edge(v, newW));
                }
            }
        }
    
        return dist;
    }
    
    static class Graph {
        
        private int V;
        
        private List<List<Edge>> adj;

        
        public Graph(int V) {
            this.V = V;
            this.adj = new ArrayList<>(V);
            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
        }

        
        public void addEdge(int u, int v, int w) {
            adj.get(u).add(new Edge(v, w));
            adj.get(v).add(new Edge(u, w));
        }
    }

    public static void main(String[] args) {
        
        int nodes = 9;
        Graph graph = new Graph(nodes);

        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 7, 8);
        graph.addEdge(1, 2, 8);
        graph.addEdge(1, 7, 11);
        graph.addEdge(2, 3, 7);
        graph.addEdge(2, 5, 4);
        graph.addEdge(2, 8, 2);
        graph.addEdge(3, 4, 9);
        graph.addEdge(3, 5, 14);
        graph.addEdge(4, 5, 10);
        graph.addEdge(5, 6, 2);
        graph.addEdge(6, 7, 1);
        graph.addEdge(6, 8, 6);
        graph.addEdge(7, 8, 7);
        
        for (int i = 0; i < nodes; i++) {
            int[] distances = dijkstra(graph, i);
            System.out.println("");
            for (int j = 0; j < distances.length; j++) {
                System.out.println("點" + i + "到點" + j + "的最短路徑長度為：" + distances[j]);
            }
        }
    }
}