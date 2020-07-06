package com.example.algorismTopCoder.Chapter05_전체_탐색;

import java.util.LinkedList;
import java.util.Queue;

public class MazeMaker {

    public int longestPath(String[] maze, int startRow, int startCol,
                           int[] moveRow, int[] moveCol) {
        int ret = 0;

        int mazeRow = maze.length;
        int mazeCol = maze[0].length();
        int[][] dp = new int[mazeRow][mazeCol];

        for (int i = 0; i < mazeRow; i++)
            for (int j = 0; j < mazeCol; j++)
                dp[i][j] = -1;

        dp[startRow][startCol] = 0;

        Queue<Integer> queRow = new LinkedList<Integer>();
        Queue<Integer> queCol = new LinkedList<Integer>();

        queRow.add(startRow);
        queCol.add(startCol);

        while (!queRow.isEmpty()) {
            int nowRow = queRow.poll();
            int nowCol = queCol.poll();

            for (int i = 0; i < moveRow.length; i++) {
                int nextRow = nowRow + moveRow[i];
                int nextCol = nowCol + moveCol[i];

                if (nextRow >= 0 && nextRow < mazeRow
                        && nextCol >= 0 && nextCol < mazeCol
                        && maze[nextRow].charAt(nextCol) == '.'
                        && dp[nextRow][nextCol] == -1) {

                    dp[nextRow][nextCol] = dp[nowRow][nowCol] + 1;
                    queRow.add(nextRow);
                    queCol.add(nextCol);
                }
            }

        }

        for (int i = 0; i < mazeRow; i++) {
            for (int j = 0; j < mazeCol; j++) {
                if (maze[i].charAt(j) == '.' && dp[i][j] == -1)
                    return -1;
                else
                    ret = Math.max(ret, dp[i][j]);
            }
        }

        return ret;
    }

}

