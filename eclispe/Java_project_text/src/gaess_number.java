import java.util.Random;
import java.util.Scanner;

public class gaess_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int randomNumber = new Random().nextInt(10);
System.out.println("随机数已生成！");
Scanner in = new Scanner (System.in);
int enterNumber = in.nextInt();
while(enterNumber!=randomNumber)
{
	if (enterNumber<randomNumber)
		{
		System.out.println("输入的数小了");
		}
	else {
		System.out.println("输入的数大了"); 
			
		}
	System.out.println("请再输入数字");
	enterNumber = in.nextInt();			
}
System.out.println("恭喜你答对了");
	}

}
