package backtracking;

public class RatInMaze {
    static int[][] maze = {
        { 1, 0, 0, 0 },
        { 1, 1, 0, 1 },
        { 0, 1, 0, 0 },
        { 1, 1, 1, 1 }
};
    public static void main(String[] args) {
        
        int n = maze.length;
        ratMaze(maze, 0, 0, "", n);
    }

    static void ratMaze(int[][] arr,int r,int c,String ans ,int n){
        if(r<0 || r>=n || c<0 || c>=n)
            return;
        
        if(arr[r][c] == 0)
            return;

        if(r == n-1 && c == n-1){
            System.out.print(ans+" ");
            return;
        }

        arr[r][c] = 0;
        ratMaze(arr, r+1, c, ans+"D", n);
        ratMaze(arr, r, c-1, ans+"L", n);
        ratMaze(arr, r, c+1, ans+"R", n);
        ratMaze(arr, r-1, c, ans+"D", n);
        arr[r][c] = 1;



    }
}
