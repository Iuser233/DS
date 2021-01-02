package shujujiego;

import java.util.Scanner;

public class text2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input  =new Scanner(System.in);//输入
int[] nums=new int [10];//定义数组
int sum=0;
double ave =0;
int maxnum=0;
int minnum=0;


//将输入的数放到数组中去
for (int i=0;i<nums.length;i++) {
	nums [i]=input.nextInt();			
}
//求输入数的平均数
for (int i=0;i<nums.length;i++) {
	sum+=nums[i];
}
ave = sum/nums.length;

//将数组中比平均数大的数打印
for (int i=0;i<nums.length;i++) {
	if (nums[i]>=ave) {
		System.out.println(nums[i]);
		
	}

}



System.out.println(nums.length);
System.out.println(ave);
System.out.println(sum);

	}

}
