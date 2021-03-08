import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=51 lang=java
 *
 * [51] N 皇后
 */

// @lc code=start
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        // char[][] chessboard;
        char[][] chessboard=new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                 chessboard[i][j]='.';
            }
        }
        backtrack(0, chessboard, res);
        return res;
    }
    public void backtrack(int row,char[][] chessboard ,List<List<String>> res) {
        //1.出口/边界条件
        if (row==chessboard.length) {
            res.add(construct(chessboard));
            return ;
        }
        //2.判断是否满足
        //3.进行回溯算法
     
            for (int col = 0; col < chessboard.length; col++) {
                if (isVaild(chessboard, row, col)) {
                    chessboard[row][col]='Q';
                    backtrack(row+1, chessboard, res);
                    chessboard[row][col]='.';
                }
               
            }
            
        
    }
    public boolean isVaild(char[][] chessboard,int row,int col) {
        //1.判断行、列、对角线是否满足要求
        //因为每次递归都增加了行数所以不需要进行行的检验
        //因为每次都是从上往下填皇后，所以对角线只要考虑左上，和右上就行了
        //1.列
        for (int i = 0; i < chessboard.length; i++) {
            if (chessboard[i][col]=='Q') {
                return false;
            }
        }
        //2.45°/左上
        for (int i = row-1, j=col-1; i >=0&&j>=0; i--,j--) {
            if (chessboard[i][j]=='Q') {
                return false;
            }
        }
        //3.135度/右下
        for (int i = row-1,j=col+1; i>=0&&j<chessboard.length; i--,j++) {
            if (chessboard[i][j]=='Q') {
                return false;
            }
        }
        return true;
    }
    public List<String> construct(char[][] chessboard) {
        //将char数组转化为字符串
        List<String> path=new ArrayList<>();
        for (int i = 0; i < chessboard.length; i++) {
            path.add(new String( chessboard[i]));
                //String类又是一种构造方法，每一种提供不同的参数来初始化字符串，
                //例如一个字符数组 chessBoard[i]就是一个字符数组

        }
        return path;

    }
}
// @lc code=end

/*n皇后问题解法主要就是回溯算法
 *def backtrack(track路径,list列表)
    for 选择 in 选择列表
        将选择加入路径
        backtrack
        撤销操作
    
*/