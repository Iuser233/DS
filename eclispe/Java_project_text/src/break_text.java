
public class break_text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j;
itcast:for(i = 1;i<=9;i++)
{
	 for (j = 1;j<=i;j++)
	 {
		if (i>4)
		{
			break itcast;
			
		}
	       System.out.print("*"); 
	 }
	 System.out.print("\n");
	 
}
	}

}
