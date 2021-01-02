package queue;

public class text0 {

	public static void main(String[] args) {
	sequenceQuence q1=new sequenceQuence();
		// TODO Auto-generated method stub
for (int i = 0; i < 6; i++) {
	q1.EnQuence(i*2);
}
q1.printquence();
q1.DeQuence();
q1.printquence();
q1.EnQuence(51);	
	q1.printquence();
q1.EnQuence(55);	
q1.printquence();
System.out.println(q1.size());
	
	
	
	}

}
