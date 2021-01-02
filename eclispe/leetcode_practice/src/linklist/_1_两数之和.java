package linklist;
class Solution 
{
    public int[] twoSum(int []nums, int target) {
int n=nums.length;
    for( int i=0;i<n;++i){
        for(int j=i+1;j<n;++j){
            if(nums[i]+nums[j]==target){
                return new int []{i,j};
            }
        }
    }
    return new int[0] ;
}
}
public class _1_两数之和 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]nums= {1,2,3,4,5,6,7};
Solution solution=new Solution();
solution.twoSum(nums, 5);

}

}
