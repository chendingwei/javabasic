package leetcode.floodfill;

public class WordSearch {
    public static final int[][] direction = {{-1,0},{0,1},{1,0},{0,-1}};

    public int rows;
    public int cols;

    public boolean[][] visited;
    public char[][] board;
    public String word;
    public boolean flag = false;
    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.word = word;

        rows = board.length;
        if(rows == 0){
            return false;
        }
        cols = board[0].length;
        visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(board[i][j] == word.charAt(0)){
                    visited[i][j] = true;
                    dfs(i,j,1);
                    visited[i][j] = false;
                }
                if (flag){
                    return flag;
                }
            }
        }
        return flag;
    }

    public void dfs(int x, int y, int len){
        if(len >= word.length() ){
            flag = true;
            return;
        }
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int newX = x + direction[i][0];
            int newY = y + direction[i][1];

            if(inArea(newX,newY) && board[newX][newY] == word.charAt(len) && !visited[newX][newY]){
                dfs(newX,newY,len+1);
            }
        }
        visited[x][y] = false;
    }

    public boolean inArea(int x, int y){
        return x >= 0 && x <rows && y >= 0 && y <cols;
    }

    public static void main(String[] args) {
        WordSearch ws = new WordSearch();
        char[][] board = {{'A','B','C','D'},
                          {'S','F','C','S'},
                          {'A','D','E','E'}};

        String word = "ABCCED";

        boolean exist = ws.exist(board, word);
        System.out.println(exist);
    }
}
