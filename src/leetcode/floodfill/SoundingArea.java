package leetcode.floodfill;

public class SoundingArea {
    public static final int[][] direction = {{-1,0},{0,1},{1,0},{0,-1}};
    public int rows;
    public int cols;

    public boolean[][] visited;
    public char[][] res;

    public void solve(char[][] board) {
        res = board;
        rows = board.length;
        if (rows == 0) {
            return;
        }
        cols = board[0].length;
        visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(res[i][j] == 'O' && !inArea(i,j))
                dfs(i, j);
            }
        }
        reverse();
        board = res;
    }

    public void dfs(int x, int y){
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int newX = x + direction[i][0];
            int newY = y + direction[i][1];

            if(inArea(newX,newY) && res[newX][newY] == 'O' && !visited[newX][newY]){
                dfs(newX,newY);
            }
        }
    }

    public void reverse(){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(!visited[i][j] && inArea(i,j)){
                    res[i][j] = 'X';
                }
            }
        }
    }

    public boolean inArea(int x,int y){
        return x > 0 && x < rows-1 && y > 0 && y < cols-1;
    }
}
