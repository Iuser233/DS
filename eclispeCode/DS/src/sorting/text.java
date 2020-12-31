package sorting;

public class text {
public static void main(String[] args) {
	int []arr1=Mysort.randomInt(100, 100);
Mysort s1=new Mysort();
int n=arr1.length;
s1.mergesort(arr1, 0, arr1.length-1);

}
}
