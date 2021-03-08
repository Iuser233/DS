import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/*
 * @lc app=leetcode.cn id=77 lang=java
 *
 * [77] 组合
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combine(int n, int k) {
List<List<Integer>> res=new ArrayList<>();
if (k<=0||n<k) {
    return res;
}
Deque <Integer> path=new ArrayDeque<>();
dfs(n, k, 1, path, res);
return res;
    }

    public void dfs(int n,int k,int begin, Deque<Integer> path ,List<List<Integer>> res) {
        if (path.size()==k) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i <=n-(k-path.size())+1; i++) {
            
            path.addLast(i);
            dfs(n, k, i+1, path, res);
            path.removeLast();
        }
    }
}
// @lc code=end

