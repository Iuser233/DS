package cn.itcast.chapter07.example14;
import java.io.*;
/**
 * 遍历指定目录下的包含子目录下的所有文件
 */
public class Example14 {
	public static void main(String[] args) {
		File file = new File("D:\\eclipseWorkspace\\JavaBasicWorkspace\\chapter07"); // 创建一个代表目录的File对象
		fileDir(file); // 调用FileDir方法
	}

	public static void fileDir(File dir) {
		File[] files = dir.listFiles(); // 获得表示目录下所有文件的数组
		for (File file : files) { // 遍历所有的子目录和文件
			if (file.isDirectory()) {
				fileDir(file); // 如果是目录，递归调用fileDir()
			}
			System.out.println(file.getAbsolutePath()); // 输出文件的绝对路径
		}
	}
}