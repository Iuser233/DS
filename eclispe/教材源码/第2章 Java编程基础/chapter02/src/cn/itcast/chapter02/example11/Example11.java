package cn.itcast.chapter02.example11;
/**
 * switch语句的使用(多个case条件后面的执行语句是一样的情况)
 */
public class Example11 {
	public static void main(String[] args) {
		int week = 2;
		switch (week) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			// 当 week 满足值 1、2、3、4、5 中任意一个时，处理方式相同
			System.out.println("今天是工作日");
			break;
		case 6:
		case 7:
			// 当 week 满足值 6、7 中任意一个时，处理方式相同
			System.out.println("今天是休息日");
			break;
		}
	}
}