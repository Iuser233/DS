package shujujiego;

import java.util.Scanner;

public class text4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������ֵ�ŵ�grade��
		System.out.println("��������ĳɼ���");
		Scanner inputScanner = new Scanner(System.in);
		int grade = inputScanner.nextInt();
//���ٷ��Ƴɼ�ת��Ϊ�弶��
		if (grade > 90) {
			System.out.println("��ĳɼ�ΪA");
		} else if (grade > 80) {
			System.out.println("��ĳɼ�ΪB");

		} else if (grade > 70) {
			System.out.println("��ĳɼ�ΪC");

		} else if (grade > 60) {
			System.out.println("��ĳɼ�ΪD");

		} else if (grade > 50) {
			System.out.println("��ĳɼ�ΪE");
		}
	}

}
