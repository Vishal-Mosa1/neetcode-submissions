class Solution {
    public boolean isValidSudoku(char[][] board) {
        int rows=board.length, cols=board[0].length;

        for(int i=0;i<rows;i++)
        {
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<cols;j++)
            {
                if(board[i][j]!='.')
                {
                    if(set.contains(board[i][j]))
                    {
                        return false;
                    }
                    set.add(board[i][j]);
                }
            }
        }

        for(int i=0;i<cols;i++)
        {
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<rows;j++)
            {
                if(board[j][i]!='.')
                {
                    if(set.contains(board[j][i]))
                    {
                        return false;
                    }
                    set.add(board[j][i]);
                }
            }
        }

        for(int r=0;r<rows;r=r+3)
        {
            for(int c=0;c<cols;c=c+3)
            {
                HashSet<Character> set = new HashSet<>();

                for(int i=0;i<3;i++)
                {
                    for(int j=0;j<3;j++)
                    {
                        char val=board[r+i][c+j];
                        if(val!='.')
                        {
                            if(set.contains(val))
                            {
                                return false;
                            }
                            set.add(val);
                        }
                    }
                }
            }
        }
        return true;
    }
}
