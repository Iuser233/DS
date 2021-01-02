package cn.itcast.chapter07.example02;
import java.io.*;
/**
 * 使用FileOutputStream将数据写入文件
 */
public class Example02 {
	public static void main(String[] args) throws Exception {
		// 创建一个文件字节输出流
		FileOutputStream out = new FileOutputStream("example.txt");
		String str = "传智播客";
		byte[] b = str.getBytes();
		for (int i = 0; i < b.length; i++) {
			out.write(b[i]);
		}
		out.close();
	}
}