package stack01;

import java.util.Stack;

public class sequencestack {
    private  final  int MaxSize=10;
    private  int[] data;
    private  int top;

    public sequencestack(){
        data=new int[MaxSize];
        top=-1;

    }

    public void push(int x){
        data[++top]=x;

    }
    public  int pop(){
        if (isEmpty()){
            throw new   IndexOutOfBoundsException("error");
        }
        int old=data[top--];
        return  old;
    }
    public  int peek(){
        return  data[top];

    }

    public boolean isEmpty(){
        return  top==-1;
    }
    public  void printstack(){
       for (int i=top;i>=0;i--){
           System.out.print(data[i]+" ");
       }
        System.out.println(" ");
    }
    public static  void main(String[] args){
        int []a={1,5,1,6,1};
        sequencestack stack1=new sequencestack();
        for (int i=0;i<10;i++){
            stack1.push(i*5);
        }
        stack1.printstack();
        System.out.println(stack1.pop());
        stack1.printstack();
    }
}
