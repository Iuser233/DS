package biSearchTree;

public class exchange {
	public void ex2(int x) {
		if (x>90) {
			System.out.println("����");
		}else if (x>80) {
			System.out.println("liang");
		}else if (x>70) {
			System.out.println("zhong");
		}else if (x>60) {
			System.out.println("jige");
			
		}else {
			System.out.println("bujige");
		}
	}
public void change(int x) {
	if (x>100||x<0) {
		System.out.println("����Υ��");
	}
	else if (x>=90&&x<=100) {
		System.out.println("����");
	}else if (x>=80&&x<90) {
System.out.println("����");
	}else if(x>=70&&x<80){
		System.out.println("�е�");
	}else if (x>=60&&x<70) {
		System.out.println("����");
	}else if (x<60&&x>0) {
		System.out.println("������");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=54;
exchange e1=new exchange();
e1.change(-4);
e1.ex2(2+300);
System.out.println();
	}

}
