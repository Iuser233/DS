package shujujiego;

import java.awt.geom.Area;
import java.util.Scanner;

class shape {
	// ��������ܳ�˽�г�Ա����
	double area;
	double perimeter;

//����getter��setter����
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	double radius;
	double length;
	double width;
}

//����shape������Բ�������Σ�������
class circle extends shape{
	 Scanner inputScanner=new Scanner(System.in)
	 radius=inputScanner.nextIn();
	 area=3.141926*radius;
			 
 }