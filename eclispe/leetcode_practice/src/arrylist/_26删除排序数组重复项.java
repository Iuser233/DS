package arrylist;

public class _26删除排序数组重复项 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 1, 2, 3, 4, 4 };
		for (int k = 0; k < nums.length; k++) {
			System.out.print(nums[k]);
		}
		System.out.println(" ");
		solution26 s1 = new solution26();
		System.out.println(s1.removeDuplicates(nums));

		for (int k = 0; k < nums.length; k++) {
			System.out.print(nums[k]);
		}
	}

}

class solution26 {
	public int removeDuplicates(int[] nums) {
		/*
		 * if nums is empty then return 0 input: int []nums output: nums has elements;
		 */
		if (nums.length == 0) {
			return 0;

		}
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;

	}
}