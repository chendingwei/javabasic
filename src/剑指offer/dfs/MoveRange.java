package 剑指offer.dfs;

public class MoveRange {
    static final int[][] direction = {{1,0},{0,1}};
    boolean[][] visited;
    int max;
    int res = 0;
    int rows;
    int cols;
    public int movingCount(int m, int n, int k) {
        visited = new boolean[m][n];
        max = k;
        rows = m;
        cols = n;
        dfs(0,0);
        return res;
    }

    public void dfs(int x,int y){
        if((x/10 + x%10 + y/10 + y%10) > max){
            return;
        }
        visited[x][y] = true;
        res++;
        for (int i = 0; i <2 ; i++) {
            int newX = x + direction[i][0];
            int newY = y + direction[i][1];
            if(inArea(newX,newY) && !visited[newX][newY] ) {
                dfs(newX, newY);
            }
        }
    }
    public boolean inArea(int x, int y){
        return x>=0 && x<rows && y>=0 && y<cols;
    }
}
