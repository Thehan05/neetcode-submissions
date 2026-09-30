class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> seen = new HashSet<>();
        for(int i = 0; i < board.length; i++) {       
            seen.clear();
            for(int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.') continue;   
                if(seen.contains(board[i][j])){
                    return false;
                }
                seen.add(board[i][j]);
            }
        }

        for(int i = 0; i < board.length; i++) {       
            seen.clear();
            for(int j = 0; j < board[i].length; j++) {
                if (board[j][i] == '.') continue;   
                if(seen.contains(board[j][i])){
                    return false;
                }
                seen.add(board[j][i]);
            }
        }
        

        for(int boxRow = 0; boxRow < 9; boxRow+=3){
            for(int boxCol = 0; boxCol < 9; boxCol+=3) {
                seen.clear();
                 for (int i = boxRow; i < boxRow + 3; i++) {
                    for (int j = boxCol; j < boxCol + 3; j++) {
                        if (board[i][j] == '.') continue;   
                        if(seen.contains(board[i][j])){
                            return false;
                        }
                        seen.add(board[i][j]);
                    }
                }
            }
        }
        return true;
    }
}
