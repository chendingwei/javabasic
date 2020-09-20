package leetcode.floodfill;

public class PictureRender {
    public static final int[][] direction = {{-1,0},{0,-1},{1,0},{0,1}};
    public int rows;
    public int cols;

    public int[][] res;
    public boolean[][] visited;
    public int oldColor;
    public int newColor;

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        rows = image.length;
        cols = image[0].length;
        res = image;
        oldColor = image[sr][sc];
        this.newColor = newColor;
        visited = new boolean[rows][cols];
        dfs(sr,sc);

        return res;
    }

    public void dfs(int i, int j){
        visited[i][j] = true;
        res[i][j] = newColor;
        for (int k = 0; k < 4; k++) {
            int newX = i + direction[k][0];
            int newY = j + direction[k][1];

            if( inArea(newX,newY) && !visited[newX][newY] && res[newX][newY] == oldColor){
                dfs(newX,newY);
            }
        }
    }

    public boolean inArea(int x, int y){
        return x>=0 && x<rows && y>=0 && y<cols;
    }

    public static void main(String[] args) {
        PictureRender pic = new PictureRender();
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr =1;
        int sc =1;
        int newColor = 2;

        int[][] res = pic.floodFill(image, sr, sc, newColor);
        System.out.println(res);
    }
}
