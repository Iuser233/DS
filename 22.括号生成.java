import java.nio.file.Path;
import java.security.interfaces.RSAKey;
import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

// @lc code=start
class Solution {
    public List<String> generateParenthesis(int n) {
List<String> res=new ArrayList<>();
StringBuilder path=new StringBuilder();
if(n==0){
    return res;
}
backtrack(path, n, n, res);
return res;
}
    public void  backtrack(StringBuilder path,int left,int right,List<String> res) {
        if (left==0&&right==0) {
            res.add(path.toString());
            return ;
        }
        if (left>right) {
            return ;
        }
        if (left>0) {
            path.append("(");
            backtrack(path, left-1, right, res);
            path.deleteCharAt(path.length()-1);
        }
        if (right>0) {
            path.append(")");
            backtrack(path, left, right-1, res);
            path.deleteCharAt(path.length()-1);
        }

    }
}
// @lc code=end

