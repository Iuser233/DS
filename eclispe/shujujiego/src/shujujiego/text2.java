package shujujiego;

import java.util.Scanner;

public class text2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input  =new Scanner(System.in);//����
int[] nums=new int [10];//��������
int sum=0;
double ave =0;
int maxnum=0;
int minnum=0;


//����������ŵ�������ȥ
for (int i=0;i<nums.length;i++) {
	nums [i]=input.nextInt();			
}
//����������ƽ����
for (int i=0;i<nums.length;i++) {
	sum+=nums[i];
}
ave = sum/nums.length;

//�������б�ƽ�����������ӡ
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
