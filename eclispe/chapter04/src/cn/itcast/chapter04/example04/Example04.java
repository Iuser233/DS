package cn.itcast.chapter04.example04;
// ����Animal��
class Animal {
	// ����Animal���вεĹ��췽��
	public Animal(String name) {
		System.out.println("����һֻ" + name);
	}
}
// ����Dog��̳�Animal��
class Dog extends Animal {
	public Dog() {
		super("smalldog"); // ���ø����вεĹ��췽��
	}
//	public Dog () {
//		System.out.println("I'm a dog");
//	}
//	public Dog (String a) {
//		System.out.println("I'm a"+a);
//	}
}
// ���������
public class Example04 {
	public static void main(String[] args) {
		Dog dog = new Dog(); // ʵ��������Dog����
		return dog.equals(2);
	}
}