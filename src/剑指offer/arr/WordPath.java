package 剑指offer.arr;

public class WordPath {
    static final int[][] direction = {{1,0},{0,1},{-1,0},{0,-1}};
    public char[][] board;
    public String word;
    int rows;
    int cols;
    boolean[][] visited;
    boolean res = false;
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0 || board[0] == null || board[0].length == 0){
            return false;
        }
        this.board = board;
        rows = board.length;
        cols = board[0].length;
        this.word = word;
        visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(board[i][j] == word.charAt(0)) {
                    dfs(i, j, 1);
                    if (res) {
                        return true;
                    }
                }
            }
        }
        return false;

    }

    public void dfs(int x, int y, int len){
        visited[x][y] = true;
        if(len == word.length()){
            res = true;
            return;
        }
        for (int i = 0; i < 4; i++) {
            int newX = x + direction[i][0];
            int newY = y + direction[i][1];

            if(inArea(newX,newY) && !visited[newX][newY] && board[newX][newY] == word.charAt(len)){
                dfs(newX,newY,len+1);
            }
        }
        visited[x][y] = false;
    }

    public boolean inArea(int x, int y){
        return x>=0 && x<rows && y>=0 && y<cols;
    }
}
