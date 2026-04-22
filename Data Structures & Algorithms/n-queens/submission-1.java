class Solution {
    
	List<List<String>> resul = new ArrayList<List<String>>();

	public void disp(int [][] board){
		List <String> res=new ArrayList<>();
		String str="";
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
               if(board[i][j]==1) {
            	   str+="Q";
               }else
            	   str+=".";
            } 
            res.add(str);
            str="";
        }
        this.resul.add(res);
    }
       public boolean checkDiag(int [][]board,int i,int j){
        int m=board.length;
        boolean flag=false;
        int row=i;
        int col=j;
        if(board[i][j]!=1) return true;
        
        while (i-1>=0 && j-1>=0) {
        	if(board[i-1][j-1]==1) return false;
        	i--;
        	j--;
        } 
        i=row;
        j=col;
        while(i-1>=0 && j+1<m) {
        	if(board[i-1][j+1]==1) return false;
        	i--;
        	j++;
        } 
        i=row;
        j=col;
        while(i+1<m && j-1>=0) {
        	if(board[i+1][j-1]==1) return false;
        	i++;
        	j--;
        } 
        i=row;
        j=col;
        while (i+1<m && j+1<m && board[i+1][j+1]==1) {
        	if(board[i+1][j+1]==1) return false;
        	i++;
        	j++;
 
        }
        return true;
    }
    public boolean checkValid(int [][]board){;
        int m=board.length;
        int row_count=0;
        int col_count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
               if(board[i][j]==1) row_count++;
               if(board[j][i]==1) col_count++;
               if(row_count>1 || col_count>1 ||!checkDiag(board,i,j)) return false;
            }
            row_count=0;
            col_count=0;
        }
        return true;
    }

   public void solve(int [][] board,int current_col){
        if(current_col>board.length) return;
        else if(current_col==board.length){
        	disp(board);
//        	System.out.println("valid arrangement");
            return;
        }
        for(int i=0;i<board.length;i++){
             board[i][current_col]=1;
             if(!checkValid(board)) {
            	 board[i][current_col]=0;
            	 continue;
             } 
             solve(board,current_col+1);
             board[i][current_col]=0;
        }
    }
    public List<List<String>> solveNQueens(int n) {
          int [][]board =new int[n][n];
          solve(board,0);
          return this.resul;
    }
}
