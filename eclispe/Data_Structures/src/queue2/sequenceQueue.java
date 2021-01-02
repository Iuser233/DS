package queue2;

import stack.matching;

public class sequenceQueue {
    int [] data;
    private final int MaxSzie=10;
    private int front,rear=0;
    public  sequenceQueue() {
        front=rear=0;
        data=new int[MaxSzie];
    }
    public int pop() {
        if(
            isEmpty()

        ){
            System.out.println("chugepi");
        }
        
    front=(front+1)%MaxSzie;
    int old=data[front];
    return old;

    }
    public void push(int x) {
        if(isFull()){
            throw new IndexOutOfBoundsException("error");
        }
        rear=(rear+1)%MaxSzie;
        data[rear]=x;
    }
    public boolean isEmpty() {
        return front==rear;

    }
    public int peek(){
            return data[front];
    
    }
    public int size() {
        return (rear-front+MaxSzie)%MaxSzie;

    }
    public void printall() {
        int i,j=front;
        for(i=1;i<size();i++){
            j=(j+1)%MaxSzie;
            System.out.println(data[j]);
        }
    }
    public void  clear() {
        front=rear=0;
    }
public boolean isFull() {
    return (rear+1)%MaxSzie==front;
}
}