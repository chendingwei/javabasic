package writtenexamination.同城58;

import java.util.Scanner;

public class Compress {
    //定义四个方向的偏移量
    private static final int[][] direction = {{-1,0},{0,-1},{1,0},{0,1}};
    //标记数组，该格子是否已经访问过
    private boolean[][] visited;
    private int rows;
    private int cols;
    private char[][] grid;


    public int numIslands(char[][] grid) {
        rows = grid.length;
        if(rows == 0){
            return 0;
        }
        cols = grid[0].length;
        this.grid = grid;
        visited = new boolean[rows][cols];
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                //没有被访问过 && 是陆地
                if( !visited[i][j] && grid[i][j] == '1'){
                    count++;
                    dfs(i,j);
                }
            }
        }
        return count;
    }

    public void dfs(int i, int j){
        visited[i][j] = true;
        for (int k = 0; k < 4; k++) {
            //四个方向的坐标
            int newX = i + direction[k][0];
            int newY = j + direction[k][1];
            // 不越界 && 没有被访问过 && 是陆地
            if( inArea(newX,newY) && !visited[newX][newY] && grid[newX][newY] == '1'){
                dfs(newX,newY);
            }
        }
    }

    public boolean inArea(int x,int y){
        return x>= 0 && x <rows && y>=0 && y <cols;
    }
}
