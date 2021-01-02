package quence;

import java.util.LinkedList;
import java.util.Queue;

public class _993最近的请求次数 {
//RecentCounter objCounter=new RecentCounter();
//int parm_1=objCounter.ping(1);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecentCounter objCounter=new RecentCounter();
		int parm_1=objCounter.ping(200);
		int a=objCounter.ping(100012);

System.out.println(a);
	}

}
class RecentCounter
{
Queue<Integer> q;
public RecentCounter () {
	q=new LinkedList();
}
public int ping(int t) {
	q.add(t);
	while (q.peek()<t-3000) {
		q.poll();
		
	}
	return q.size();
}


}