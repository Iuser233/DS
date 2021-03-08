/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
for (int i = 0; i < numbers.length; i++) {
    int low=0;int hight =numbers.length-1;
    int mid=numbers[(low+hight)/2];
    if (numbers[mid]==target) {
        return new int []{low+1,hight+1};
    }else if(numbers[mid]<target)
    {low=mid+1;}else {
        hight=mid-1;
    }
    
}
return new int []{-1,-1};
}
}
// @lc code=end

