class Solution {
    public boolean isValidSudoku(char[][] board) {
       //check in box;
        boolean result=false;
        int maxrow=0;
        int maxcol=0;
        int row=0;
        int col=0;
        for(int k=0;k<3;k++){
            row=3*k;
            for(int t=0;t<3;t++){
                col=3*t;
                HashSet hset=new HashSet();
                for(int i=row;i<row+3;i++){
            for (int j=col;j<col+3;j++){
                if(!Character.isLetterOrDigit(board[i][j])) continue;
                if(hset.contains(board[i][j])) return false;
                hset.add(board[i][j]);
            }
        }

            }
        }

        for(int rowi=0;rowi<9;rowi++){
            HashSet hset=new HashSet();
            for(int colj=0;colj<9;colj++){
            if(!Character.isLetterOrDigit(board[rowi][colj])) continue;
             if(hset.contains(board[rowi][colj])) return false;
              hset.add(board[rowi][colj]);
            }
        }

        for(int rowi=0;rowi<9;rowi++){
            HashSet hset=new HashSet();
            for(int colj=0;colj<9;colj++){
            if(!Character.isLetterOrDigit(board[colj][rowi])) continue;

             if(hset.contains(board[colj][rowi])) return false;
              hset.add(board[colj][rowi]);
            }
        }
       
        return true;
    }
}
