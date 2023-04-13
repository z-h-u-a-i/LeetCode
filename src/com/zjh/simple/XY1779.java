package com.zjh.simple;

public class XY1779 {
    public static void main(String[] args) {
        //[1,2],[3,1],[2,4],[2,3],[4,4]
        int[][] points = {{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}};
        System.out.println(new XY1779().nearestValidPoint(3, 4, points));
    }

    public int nearestValidPoint(int x, int y, int[][] points) {
        int min = -1;
        int res = 0;
        int index = -1;
        for (int i = 0; i < points.length; i++) {
            if (x == points[i][0] || y == points[i][1]) {
                res = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if(min == -1 || min > res) {
                    min = res;
                    index = i;
                }
            }
        }
        return index;
    }
}
