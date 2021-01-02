package cn.itcast.chapter07.example03;
import java.io.*;
/**
 * 使用FileOutputStream将数据追加到文件末尾
 */
public class Example03 {
	public static void main(String[] args) throws Exception {
		OutputStream out = new FileOutputStream("example.txt ", true);
		String str = "欢迎你!";
		byte[] b = str.getBytes();
		for (int i = 0; i < b.length; i++) {
			out.write(b[i]);
		}
		out.close();
	}
}