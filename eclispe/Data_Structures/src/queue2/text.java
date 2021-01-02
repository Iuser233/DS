package queue2;

public class text {
     public static void main(String[] args) {
      sequenceQueue sequenceQueue1=new sequenceQueue();
      for(int i=1;i<5;i++){
        sequenceQueue1.push(i);  
      }
      sequenceQueue1.printall();
    } 
}