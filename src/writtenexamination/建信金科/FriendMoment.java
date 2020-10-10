package writtenexamination.建信金科;

public class FriendMoment {
    public int findFriendNum (int[][] M) {
        // write code here
        int rows = M.length;
        int cols = M[0].length;
        if(rows == 0 || M == null || cols == 0){
            return 0;
        }

        int num = 0;
        boolean[] visited = new boolean[rows];
        for (int i = 1; i < rows; i++) {
            if (!visited[i]){
                visited[i] = true;
                num++;
                dfs(M,visited,rows,cols,i);
            }else {
                continue;
            }
        }
        return num;
    }

    public void dfs(int[][] M, boolean[] visited, int rows, int cols, int index){
        for (int i = 0; i < rows; i++) {
            if(i == index){
                continue;
            }else {
                if(!visited[i] && M[index][i] == 1){
                    visited[i] = true;
                }
            }
        }
    }
}
