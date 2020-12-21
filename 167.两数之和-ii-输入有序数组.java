/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
int low=0;int hight=numbers.length-1;
while (low<hight) {
    int sum=numbers[low]+numbers[hight];
    if (sum==target) {
        return new int[]{low+1,hight+1};
    }
    else if (sum>target) {
        --hight;
    }else {
        ++low;
    }
  
}
return new int[]{-1,-1};
}
}
// @lc code=end

