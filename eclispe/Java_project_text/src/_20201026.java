class yiinxong()
{
	String name;
	String jinengnameString;
	void jineng() {
		System.out.println("我的技能是");
	}
}
class houyi extends yiinxong{
	public void printjing() {
		System.out.println("wdjns"+jineng(););
	}
}
public class _20201026 {
	
	public static void main(String[] args) {
		houyi houyi1=new houyi();
		houyi1.name="sas";
		houyi1.printjing();
	}
	
}
