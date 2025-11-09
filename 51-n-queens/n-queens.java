class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board= new char[n][n];
        for(int i=0;i<n;i++)
        Arrays.fill(board[i],'.');
        solve(board,0,res);
        return res;
}
        void solve(char[][] board,int col,List<List<String>> res)
        {
        int n=board.length;
        if(col==n)
        {
        List<String> temp = new ArrayList<>();
        for(int i=0;i<n;i++)
        temp.add(new String(board[i]));
        res.add(temp);
        return;
        }
        for(int row=0;row<n;row++)
        {
        if(isSafe(board,row,col))
        {
        board[row][col]='Q';
        solve(board,col+1,res);
        board[row][col]='.'; 
        }
        }
        }
        boolean isSafe(char[][] board,int row,int col)
        {
            int n=board.length;
        for(int j=0;j<n;j++)
        {
        if(board[row][j]=='Q') return false;
        }
        for (int i = 0; i < n; i++)
        if (board[i][col] == 'Q') return false;
        for(int i=row-1,j=col-1;i>=0&&j>=0;j--,i--)
        {
        if(board[i][j]=='Q') return false;
        }
        for(int i=row+1,j=col-1;i<n&&j>=0;i++,j--)
        {
        if(board[i][j]=='Q') return false;
        }
        return true;
        }

}