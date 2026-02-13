// Last updated: 2/13/2026, 9:39:09 AM
class Solution {
    private int[] parent;

    public int minSwapsCouples(int[] row) {
        int n = row.length / 2;
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < row.length; i += 2) {
            int a = row[i] / 2;
            int b = row[i + 1] / 2;
            parent[find(a)] = find(b);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (find(i) == i) {
                count++;
            }
        }
        return n - count;
    }

    private int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
}
