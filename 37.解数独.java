
/*
 * @lc app=leetcode.cn id=37 lang=java
 *
 * [37] 解数独
 */

// @lc code=start
class Solution {
    public void solveSudoku(char[][] board) {
        backtrack(board);
        
    }

    public boolean backtrack(char[][] board) {
        for (int i = 0; i < board.length; i++) { // 行遍历
            for (int j = 0; j < board[0].length; j++) { // 列遍历
                if (board[i][j] != '.') {
                    continue;
                }
                for (char k = '1'; k <= '9'; k++) { // 选择路径
                    // 2.先判断是否合法，一行，一列，一个九宫格都是1~9
                    if (valid(i, j, k, board)) {
                        board[i][j] = k;    //将选择添加到路径
                        if (backtrack(board)) {
                            return true;
                        }
                        board[i][j] = '.'; // 回溯
                    }
                }
                return false;
            }
        }
        return true;

    }
    public boolean  valid(int row,int col,char val,char[][] board) {
       //1.判断一行里面有没有已经重复的数
        for (int i = 0; i < 9; i++) {
            if (board[row][i]==val) {
                return false;
            }
        }
        //2.判断列
        for (int i = 0; i < 9; i++) {
            if (board[i][col]==val) {
                return false;
            }
        }
  

        //判断一个九宫格
        int startRow=(row/3)*3;//将行数划分为三段0~2，3~5，6~8，每一段都是从同一个地方开始搜索
        int startCol=(col/3)*3;
        for (int i = startRow; i < startRow+3; i++) {
            for (int j = startCol; j < startCol+3; j++) {
                if (board[i][j]==val) {
                    return false;
                }
            }
        }
        return true;
    }

}
// @lc code=end
