package arrylist;

/*/
 * 二分法查找
 */
public class _35搜索插入位置 {
public static  void main (String [] args) {
	int [] nums= {1,25,30,56,89,101};
	int a=solution35.searchInsert(nums, 56);
	System.out.println(a);
}
}

class solution35 {

	public static int searchInsert(int[] nums, int target) {
		int len = nums.length;
		if (len == 0) {
			return 0;

		}
		int left = 0;
		int right = len;
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] < target) {
				left = mid + 1;

			} else {
				right = mid;
			}
		}
		return left;
	}
}