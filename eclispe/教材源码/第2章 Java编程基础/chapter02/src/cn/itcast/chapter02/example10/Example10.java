package cn.itcast.chapter02.example10;
/**
 * switch语句的使用
 */
public class Example10 {
	public static void main(String[] args) {
		int week = 8;
		switch (week) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期天");
			break;
		default:
			System.out.println("输入的数字不正确...");
			break;
		}
	}
}