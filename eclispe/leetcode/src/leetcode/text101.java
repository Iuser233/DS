package leetcode;
class Solution {
	 public static int[][] transpose(int[][] A) {
	        int r = A.length;
	        int c = A[0].length;
	        int[][] ans = new int[c][r];
	        
	        for(int i = 0; i < c; i++){
	         
	            for(int j = 0; j < r; j++){
	              
	                ans[i][j] = A[j][i];
	            }
	        }
	        return ans;
	    }}

public class text101 {
	public static void main(String[] args) {
		int [][]transpor()
		
		
	}
}
