import java.util.Scanner;

public class weekday_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
int week = in.nextInt();
switch (week) {
case 1:
	System.out.println("Monday");
	
	break;
case 2:
	System.out.println("Tuesday");
	break;
case 3:
	System.out.println("Wednesday");
	break;
case 4:
	System.out.println("Thurday");
	break;
case 5:
	System.out.println("Firday");
	break;
case 6:
	System.out.println("Saturday");
	break;
case 7:
	System.out.println("Sunday");
	break;
	
default:
	break;
}

	}

}
