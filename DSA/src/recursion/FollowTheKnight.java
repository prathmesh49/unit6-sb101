package recursion;

import java.util.Scanner;

public class FollowTheKnight { 
    static int[][] board = new int[10][10];
    static int[] seq = {-2,-1,1,2};
    static int ans = 0;
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int mov = sc.nextInt();
        solve(row-1, col-1, mov);
        System.out.println(ans);
        
        
        sc.close();
    }
    static void solve(int i,int j,int n){
        if(i<0||j<0||i>9||j>9) return;
        if(n==0){
            ans += board[i][j];
            board[i][j]=1;
            return;
        }
        for(int k=0 ; k<4 ; k++){
            int l = 3 - Math.abs(seq[k]);
            solve(i+seq[k], j-l, n-1);
            solve(i+seq[k], j+l, n-1);
        }
    }
}
