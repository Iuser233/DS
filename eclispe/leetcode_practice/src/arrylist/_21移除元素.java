package arrylist;
class solution21{
	public int removeElement( int [] nums ,int val) {
		int i=0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j]!=val) {
				nums[i]=nums[j];
				i++;
				
			}
			
			
		}
		return i;
				
	}
}
public class _21ÒÆ³ýÔªËØ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {0,1,1,2,3,5};
int[]b= {1,1,1,1,2,2,3,5};
solution21 solution21=new solution21();
System.out.println(solution21.removeElement(a, 1));
System.out.println(solution21.removeElement(b,1 ));
	}

}
