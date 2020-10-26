package com.example.algorithm_top50.graph_dfs_bfs;

public class A01_NumberOfIsland_DFS {

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        A01_NumberOfIsland_DFS a = new A01_NumberOfIsland_DFS();
        int answer = a.numsIslands(grid);
        System.out.println(answer);
    }

    // TODO grid, m, n 이런거 모아서 static 객체로 만들어서 쓰면 될거 같은데
    int m, n;

    int numsIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;

        m = grid.length;
        n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    System.out.println("i: " + i + " y: " + j);
                    merge(grid, i, j);
                }
            }
        }

        return count;
    }

    void merge(char[][] grid, int i, int j) {
        System.out.println("==merge=====i: " + i + " y: " + j);
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != '1') return;

        grid[i][j] = 'X';
        merge(grid, i - 1, j);
        merge(grid, i + 1, j);
        merge(grid, i, j + 1);
        merge(grid, i, j - 1);
    }

}
