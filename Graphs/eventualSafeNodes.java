package LeetCode.Graphs;

// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.Queue;

public class eventualSafeNodes {
    //     public List<Integer> eventualSafeNodes(int[][] graph) {
    //         int n = graph.length;
    //         int[] indegree = new int[n];
    //         List<List<Integer>> adj = new ArrayList<>();
    
    //         for(int i = 0; i < n; i++) {
    //             adj.add(new ArrayList<>());
    //         }
    
    //         for (int i = 0; i < n; i++) {
    //             for (int node : graph[i]) {
    //                 adj.get(node).add(i);
    //                 indegree[i]++;
    //             }
    //         }

    //         System.out.println(adj);

    //         for(int x : indegree)
    //         System.out.print(", "+x);
    
    //         Queue<Integer> q = new LinkedList<>();
    //         // Push all the nodes with indegree zero in the queue.
    //         for (int i = 0; i < n; i++) {
    //             if (indegree[i] == 0) {
    //                 q.add(i);
    //             }
    //         }
    
    //         boolean[] safe = new boolean[n];
    //         while (!q.isEmpty()) {
    //             int node = q.poll();
    //             safe[node] = true;
    
    //             for (int neighbor : adj.get(node)) {
    //                 // Delete the edge "node -> neighbor".
    //                 indegree[neighbor]--;
    //                 if (indegree[neighbor] == 0) {
    //                     q.add(neighbor);
    //                 }
    //             }
    //         }
    
    //         List<Integer> safeNodes = new ArrayList<>();
    //         for (int i = 0; i < n; i++) {
    //             if (safe[i]) {
    //                 safeNodes.add(i);
    //             }
    //         }
    //         return safeNodes;
    //     }
    
    // public static void main(String[] args) {
    //     eventualSafeNodes obj = new eventualSafeNodes();
    //     int [][] graph = { {1,2},{2,3},{5},{0},{5},{},{} } ;
    //     System.out.println(obj.eventualSafeNodes(graph));
    //    // obj.eventualSafeNodes(graph) ;
    // }
}
