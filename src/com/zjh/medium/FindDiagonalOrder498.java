package com.zjh.medium;
import java.util.Arrays;

public class FindDiagonalOrder498 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] res = findDiagonalOrder(mat);
        System.out.println(Arrays.toString(res));
    }

    public static int[] findDiagonalOrder(int[][] mat) {
        int[] res = new int[mat.length * mat[0].length];
        int p = 0;
        int diagonalNum = mat.length + mat[0].length - 1;
        for (int i = 1; i <= diagonalNum; i++) {
            if (i % 2 != 0) {
                //奇数对角线，斜向上遍历
                int y = i - 1;
                int x = 0;
                //获取一个有效的开始坐标
                while (y > mat.length - 1 || x > mat[0].length - 1) {
                    y--;
                    x++;
                }
                //斜向上遍历
                while (y < mat.length  && y >= 0 && x < mat[0].length) {
                    res[p] = mat[y][x];
                    y--;
                    x++;
                    p++;
                }
            } else {
                //偶数对角线，斜向下遍历
                int y = 0;
                int x = i - 1;
                //获取一个有效的开始坐标
                while (y > mat.length - 1 || x > mat[0].length - 1) {
                    y++;
                    x--;
                }
                //斜向下遍历
                while (y < mat.length && x < mat[0].length && x >= 0) {
                    res[p] = mat[y][x];
                    y++;
                    x--;
                    p++;
                }
            }
        }
        return res;
    }
}
