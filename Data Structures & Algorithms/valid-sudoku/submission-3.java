class Solution {
    private boolean isValidColumn(char[][] board){
     for(char[] column : board ){
        for(char[] table : board){
            int count=0;
            HashSet<Character> row = new HashSet<>();
            for(char element : table){
                if (element!='.'){
                    row.add(element);
                }
                else{
                    count+=1;
                }
            }
            if (row.size()+count!=9){
                return false;
            }
            else{
                row.clear();
                count=0;
            }
        }
      
     }
    return true;}
    private boolean isValidRow(char[][] board){
        HashSet<Character> row = new HashSet<>();
        int count=0;
        for (int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                if (board[j][i]!='.'){
                    row.add(board[j][i]);
                }
                else{
                    count+=1;
                }
            }
            if (row.size()+count!=9){
                return false;
            }
            else{
                row.clear();
                count=0;
            }
        }
        return true;

    }
    private boolean isValidBox(char[][] board){
        HashSet<Character> row = new HashSet<>();
        int count = 0;
        for (int h=0; h<7 ;h+=3){
        for (int k=0; k<7;k+=3){
            for(int i=0;i<3;i++){
                for(int j=0; j<3;j++){
                    if (board[i+k][j+h]!='.'){
                            row.add(board[i+k][j+h]);
                        }
                        else{
                            count+=1;
                        }
                }
            }
            if (row.size()+count!=9){
                return false;
            }
            else{
                row.clear();
                count=0;
            }}
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        if (isValidColumn(board) && isValidRow(board) && isValidBox(board)){
            return true;
        }
        else{
            return false;
        }
    }
}
