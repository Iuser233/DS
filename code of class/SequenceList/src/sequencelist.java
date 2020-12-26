
public class sequencelist {
   // 顺序表中存放的数据
  // 顺序表的元素个数
  // 顺序表大小
  
  int count;
  int maxsize=10;
  int[]data=new int[maxsize];
    public boolean add(int x, int pos) {
        if (isFull()) {
            // System.out.println("isfull");
            int[] a = new int[10 * 2];
            for (int i = 0; i < a.length; i++) {
                a[i] = data[i];
            }
            data = a;
        }
        // 判断位置是否合法
        if (pos > data.length || pos < 1) {
            System.out.println("error pos");
            return false;
        }
        for (int i = data.length; i > pos; i--) {
            data[i + 1] = data[i - 1];
        }
        count++;
        data[pos - 1] = x;
        return true;

    }

    public int del(int pos) {
        if (isEmpty()) {
            System.out.println("空");
        }
        if (pos > data.length || pos < 1) {
            System.out.println("error pos");
        }
        int x = data[pos - 1];
        for (int i = pos; i < data.length; i++) {
            data[pos - 1] = data[pos];
        }
        count--;
        return x;
    }

    public void modify(int x,int pos) {
        if (isEmpty()) {
            System.out.println("空");
        }
        if (pos > data.length || pos < 1) {
            System.out.println("error pos");
        }
        data[pos-1]=x;

    }

    public int find(int pos) {
        if (pos > data.length || pos < 1) {
            System.out.println("error pos");
        }
        return data[pos-1];
    }

  
    public int search(int x) {
        if (isEmpty()) {
            System.out.println("empyty");
            return -1;
        }else{

        for (int i = 0; i < data.length;) {
            if (data[i]==x) {
                return i+1;
            }
            else{
                return -1;
            }
            6546
        }
    }
    return x;
    
}

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == data.length;
    }

    public void printall() {
for (int i = 0; i < data.length; i++) {
    System.out.print(data[i]+" ");
}
    }

    public void clear() {
count=0;
    }

    public int size() {

        return count;
    }

}
