package shujujiego;

import seqlist.newtext;

public class text6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
shape1 s1=new Circle(3.5);

System.out.println(s.getPerimeter());

	}

}
//
//public abstract class shape1 {
//
//	public abstract double getPerimeter();
//
//}

class Circle extends shape1 {
	private double radius;

	public Circle(double r) {
		radius = r;
	}

	public double getPerimeter() {
		return Math.PI * radius * 2;
	}
}