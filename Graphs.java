import java.lang.reflect.Array;
import java.util.*;

public class Graphs {

    static class Edges {
        int src;
        int dest;

        public Edges(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edges>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edges(0, 2));
        graph[1].add(new Edges(1, 2));
        graph[1].add(new Edges(1, 3));
        graph[2].add(new Edges(2, 0));
        graph[2].add(new Edges(2, 1));
        graph[2].add(new Edges(2, 3));
        graph[3].add(new Edges(3, 1));
        graph[3].add(new Edges(3, 2));
    }

    public static void bfs(ArrayList<Edges>[] graph) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[graph.length];
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!visited[curr]) {
                System.out.print(curr + " ");
                for (int i = 0; i < graph[curr].size(); i++) {
                    q.add(graph[curr].get(i).dest);
                }
                visited[curr] = true;
            }
        }
    }

    public static void main(String[] args) {
        // store the graph
        ArrayList<Edges>[] graph = new ArrayList[4];
        createGraph(graph);
        bfs(graph);
        // for(ArrayList<Edges> edges : graph){
        // for(int i = 0; i < edges.size(); i++){
        // System.out.println(edges.get(0).src+" "+edges.get(i).dest);
        // }
        // }
    }
}
