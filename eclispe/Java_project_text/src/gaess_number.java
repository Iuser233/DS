import java.util.Random;
import java.util.Scanner;

public class gaess_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int randomNumber = new Random().nextInt(10);
System.out.println("����������ɣ�");
Scanner in = new Scanner (System.in);
int enterNumber = in.nextInt();
while(enterNumber!=randomNumber)
{
	if (enterNumber<randomNumber)
		{
		System.out.println("�������С��");
		}
	else {
		System.out.println("�����������"); 
			
		}
	System.out.println("������������");
	enterNumber = in.nextInt();			
}
System.out.println("��ϲ������");
	}

}
