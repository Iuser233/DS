package seqlist;

public class text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Squlist<student> stuList=new Squlist<student>();
student stu1=new student("nancy", 18);
student stu2=new student("jack", 19);
student stu3=new student("lucy", 20);
stuList.add(stu1,1);
stuList.add(stu2,2);
stuList.add(stu3,3);
stuList.nextOder();

	}

}
