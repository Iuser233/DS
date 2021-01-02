import java.io.InputStream;
import java.util.Scanner;

public class facter {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
//int n=in.nextInt();
//int factor=1;
//for (int i = 1; i <= n; i++) {
//	factor *=i;
//}
//System.out.println(factor);

for(int n = 2;n<100;n++)
{
		int isPrimer = 1;	
		for(int i=2;i<n;i++)
		{
			if (n%i==0)
			{
				isPrimer =0;
//				System.out.println(n+"²»ÊÇËØÊý"+"£¬i="+i);
				break;
			}
		}
		if(isPrimer == 1)
		{
		System.out.print(n+" ");
		}	else {
			
		}
}
	
	}
	}


