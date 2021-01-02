package linklist;

import java.text.BreakIterator;

/**
 * 
 * @param args
 */
class text4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//先将两个数组合并
    	int []nums;
    	int m=nums1.length;
    	int n=nums2.length;
    	nums=new int[m+n];
//再判断nums1和nums2有没有一个为空。有的话直接根据另一个的元素个数奇偶输出中位数
    	if (m==0) {
			if (n%2==0) {
				return (nums2[n/2-1]+nums2[n/2])/2.0;
				
			}else {
				return nums2[n/2];
			}
			
		}
    	if (n==0) {
			if (m%2==0) {
				return (nums1[n/2-1]+nums1[n/2])/2.0;
				
			}else {
				return nums1[n/2];
			}
			
		}
    	int count=0;
    	int i=0;
    	int j=0; 	//用来当作nnums2的指针
    //2.当nums1和2数组都不为空时，先将两个数组合为一个数组，在进行奇偶讨论
   //2.1nums1为空时
    	while (count!=(m+n)) {
			if (i==m) {
				while (j!=n) {
					nums[count++]=nums2[j++];
				}
				break;
				}
	//2.2nums2为空		
			if (j==n) {
				while (i!=m) {
					nums[count++]=nums1[i++];
				}
				break;
				}
	//2.3nums1\2d都不为空,对两个数组排序分大小分别放进nums中
if (nums1[i]<nums2[j]) {
nums[count++]=nums[i++];

}	
else {
nums[count++]=nums2[j++];
}

			
		}
    	//2.4判断奇偶，输出中位数
    	if (count%2==0) {
    		return (nums[count/2-1]+nums[count/2])/2.0;
    		
    	}else {
    		return nums[count/2];
    	}
    	
    	
    }
}
public class _4寻找两个正序数组的中位数 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(7/2);
	}
int [] a= {1,3,5,7,9};
int [] b= {2,4,6,8,10};
text4 t4=new text4();

}
