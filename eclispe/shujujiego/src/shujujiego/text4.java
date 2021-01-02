package shujujiego;

import java.util.Scanner;

public class text4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 将输入的值放到grade中
		System.out.println("请输入你的成绩：");
		Scanner inputScanner = new Scanner(System.in);
		int grade = inputScanner.nextInt();
//将百分制成绩转换为五级制
		if (grade > 90) {
			System.out.println("你的成绩为A");
		} else if (grade > 80) {
			System.out.println("你的成绩为B");

		} else if (grade > 70) {
			System.out.println("你的成绩为C");

		} else if (grade > 60) {
			System.out.println("你的成绩为D");

		} else if (grade > 50) {
			System.out.println("你的成绩为E");
		}
	}

}
