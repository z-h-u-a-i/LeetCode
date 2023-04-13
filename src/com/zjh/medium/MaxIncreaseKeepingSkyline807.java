package com.zjh.medium;

public class MaxIncreaseKeepingSkyline807 {
    public static void main(String[] args) {
        int[][] grid = {
                {3, 0, 8, 4},
                {2, 4, 5, 7},
                {9, 2, 6, 3},
                {0, 3, 1, 0}
        };
        System.out.println(maxIncreaseKeepingSkyline(grid));
    }
    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int rowMax = maxRow(grid[i]);
                int colMax = maxCol(grid, j);
                if (rowMax > colMax) {
                    sum += colMax - grid[i][j];
                } else {
                    sum += rowMax - grid[i][j];
                }
            }
        }
        return sum;
    }

    public static int maxRow(int[] ints) {
        int max = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] > max) {
                max = ints[i];
            }
        }
        return max;
    }

    public static int maxCol(int[][] grid, int col) {
        int max = grid[0][col];
        for (int i = 1; i < grid.length; i++) {
            if (grid[i][col] > max) {
                max = grid[i][col];
            }
        }
        return max;
    }
}
