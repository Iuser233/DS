package cn.itcast.chapter07.example13;
import java.io.*;
/**
 * 遍历指定目录下所有扩展名为.txt的文件
 */
public class Example13 {
	public static void main(String[] args) throws Exception {
		// 创建File对象
		File file = new File("D:\\eclipseWorkspace\\JavaBasicWorkspace\\chapter07");
		// 创建过滤器对象
		FilenameFilter filter = new FilenameFilter() {
			// 实现accept()方法
			public boolean accept(File dir, String name) {
				File currFile = new File(dir, name);
				// 如果文件名以.txt结尾返回true，否则返回false
				if (currFile.isFile() && name.endsWith(".txt")) {
					return true;
				} else {
					return false;
				}
			}
		};
		if (file.exists()) { // 判断File对象对应的目录是否存在
			String[] lists = file.list(filter); // 获得过滤后的所有文件名数组
			for (String name : lists) {
				System.out.println(name);
			}
		}
	}
}