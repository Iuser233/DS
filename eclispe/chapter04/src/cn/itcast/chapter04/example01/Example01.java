package cn.itcast.chapter04.example01;

// 定义Animal类
class Animal {
	String name; // 定义name属性

	// 定义动物叫的方法
	void shout() {
		System.out.println("动物发出叫声");
	}
	void run() {
		System.out.println("run 3km");
		
	}
}

// 定义Dog类继承Animal类
class Dog extends Animal {
	// 定义一个打印name的方法
	public void printName() {
		System.out.println("name=" + name);
	}
	void shout() {
		super.shout();
		System.out.println("wanwanwan");
	}
}

// 定义测试类
public class Example01 {
	public static void main(String[] args) {
		Dog dog = new Dog(); // 创建一个Dog类的实例对象
		dog.name = "wangpiguo"; // 为Dog类的name属性进行赋值
		dog.run();
		dog.printName(); // 调用dog类的getInfo()方法
		dog.shout(); // 调用dog类继承来的shout()方法
	}
}
