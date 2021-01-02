package cn.itcast.chapter07.example04;
import java.io.*;
/**
 * 文件的拷贝
 */
public class Example04 {
	public static void main(String[] args) throws Exception {
		// 创建一个字节输入流，用于读取当前目录下source文件夹中的mp3文件
		InputStream in = new FileInputStream("source\\五环之歌.mp3");
		// 创建一个文件字节输出流，用于将读取的数据写入target目录下的文件中
		OutputStream out = new FileOutputStream("target\\五环之歌.mp3");
		int len; // 定义一个int类型的变量len，记住每次读取的一个字节
		long begintime = System.currentTimeMillis(); // 获取拷贝文件前的系统时间
		while ((len = in.read()) != -1) { // 读取一个字节并判断是否读到文件末尾
			out.write(len); // 将读到的字节写入文件
		}
		long endtime = System.currentTimeMillis(); // 获取文件拷贝结束时的系统时间
		System.out.println("拷贝文件所消耗的时间是：" + (endtime - begintime) + "毫秒");
		in.close();
		out.close();
	}
}