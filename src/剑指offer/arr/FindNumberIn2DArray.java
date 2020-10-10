package 剑指offer.arr;

public class FindNumberIn2DArray {
    public static final int[][] direction = {{1,0},{0,1},{-1,0},{0,-1}};
    public boolean res = false;
    public int rows;
    public int cols;
    public boolean[][] visited;
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length==0 || matrix[0] == null || matrix[0].length == 0){
            return false;
        }
        rows = matrix.length;
        cols = matrix[0].length;
        visited = new boolean[rows][cols];
        dfs(matrix,target,0,0);
        return res;
    }
    public void dfs(int[][] matrix,int target,int x,int y){
        visited[x][y] = true;
        if(matrix[x][y] > target || matrix[x][y] < target){
            return;
        }
        if(matrix[x][y] == target){
            res = true;
            return;
        }
        for (int i = 0; i < 4; i++) {
            int newX = x + direction[i][0];
            int newY = y + direction[i][1];

            if(inArea(newX,newY) && !visited[newX][newY]){
                dfs(matrix,target,newX,newY);
            }
        }
    }

    public boolean inArea(int x, int y){
        return x>=0 && x< rows && y>=0 && y<cols;
    }

    public boolean findNumberIn2DArray2(int[][] matrix, int target) {
        int i = matrix.length - 1;
        int j = 0;
        while(i >= 0 && j < matrix[0].length)
        {
            if(matrix[i][j] > target) i--;
            else if(matrix[i][j] < target) j++;
            else return true;
        }
        return false;
    }


}
