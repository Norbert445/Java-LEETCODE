package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public int regionsBySlashes(String[] grid) {
        int N = grid.length;
        DSU dsu = new DSU(4 * N * N);

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length(); j++) {
                int root = 4 * (i * N + j);
                if (grid[i].charAt(j) != '\\') {
                    dsu.union(root, root + 1);
                    dsu.union(root + 2, root + 3);
                }
                if (grid[i].charAt(j) != '/') {
                    dsu.union(root, root + 2);
                    dsu.union(root + 1, root + 3);
                }

                if (i + 1 < N) {
                    dsu.union(root + 3, (root + 4 * N) + 0);
                }
                if (i - 1 >= 0) {
                    dsu.union(root + 0, (root - 4 * N) + 3);
                }

                if (j + 1 < N) {
                    dsu.union(root + 2, (root + 4) + 1);
                }
                if (j - 1 >= 0) {
                    dsu.union(root + 1, (root - 4) + 2);
                }
            }
        }

        int res = 0;
        for (int i = 0; i < 4 * N * N; i++) {
            if (i == dsu.find(i)) res++;
        }

        return res;
    }
}

class DSU {
    int[] parent;

    DSU(int N) {
        parent = new int[N];
        for (int i = 0; i < N; i++) {
            parent[i] = i;
        }
    }

    int find(int x) {
        if (parent[x] != x) parent[x] = find(parent[x]);
        return parent[x];
    }

    void union(int x, int y) {
        parent[find(x)] = find(y);
    }
}
