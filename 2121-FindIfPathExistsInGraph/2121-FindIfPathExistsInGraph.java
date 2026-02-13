// Last updated: 2/13/2026, 9:38:49 AM
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n];
        q.add(source);
        vis[source] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            if (node == destination) return true;
            for (int neighbor : adj.get(node)) {
                if (!vis[neighbor]) {
                    q.add(neighbor);
                    vis[neighbor] = true;
                }
            }
        }

        return false; 
    }
}
