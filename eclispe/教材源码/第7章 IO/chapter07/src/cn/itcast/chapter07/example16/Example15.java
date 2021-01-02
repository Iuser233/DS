package cn.itcast.chapter07.example16;
import java.io.*;
/**
 * 删除指定目录
 */
public class Example15 {
	public static void main(String[] args) {
		File file = new File("D:\\test"); // 这是一个代表目录的File对象
		if (file.exists()) {
			System.out.println(file.delete());
		}
	}
}