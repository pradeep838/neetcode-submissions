class Solution {

   private int getNumber(char ch){
    if(ch=='.') return -1;
    else return Integer.parseInt(Character.toString(ch));
   }
    public boolean isValidSudoku(char[][] board) {

        boolean [] value=new boolean[9]; 

        for(int row=0;row<9;row=row+3){
            for (int col=0;col<9;col=col+3){
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        int num=getNumber(board[row+i][col+j]);
                        if(num==-1)continue;
                        System.out.println(num+"\t"+row+i+"\t"+col+j);
                        if(value[num-1]) return false;
                        else value[num-1]=true;
                    }
                }
                // reset value
                value=new boolean[9];
            }
        }
   
        // row check 
       
        for(int i=0;i<9;i++){
            value=new boolean[9];
            for(int j=0;j<9;j++){
                  int num=getNumber(board[i][j]);
                        if(num==-1)continue;
                if(value[num-1]) return false;
                else value[num-1]=true;
            }
        }

         for(int i=0;i<9;i++){
            value=new boolean[9];
            for(int j=0;j<9;j++){
                 int num=getNumber(board[j][i]);
                 if(num==-1)continue;
                if(value[num-1]) return false;
                else value[num-1]=true;
            }
        }

        return true;
        
    }
}
