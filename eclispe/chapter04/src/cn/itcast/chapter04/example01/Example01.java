package cn.itcast.chapter04.example01;

// ����Animal��
class Animal {
	String name; // ����name����

	// ���嶯��еķ���
	void shout() {
		System.out.println("���﷢������");
	}
	void run() {
		System.out.println("run 3km");
		
	}
}

// ����Dog��̳�Animal��
class Dog extends Animal {
	// ����һ����ӡname�ķ���
	public void printName() {
		System.out.println("name=" + name);
	}
	void shout() {
		super.shout();
		System.out.println("wanwanwan");
	}
}

// ���������
public class Example01 {
	public static void main(String[] args) {
		Dog dog = new Dog(); // ����һ��Dog���ʵ������
		dog.name = "wangpiguo"; // ΪDog���name���Խ��и�ֵ
		dog.run();
		dog.printName(); // ����dog���getInfo()����
		dog.shout(); // ����dog��̳�����shout()����
	}
}
