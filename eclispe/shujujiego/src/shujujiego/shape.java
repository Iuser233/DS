package shujujiego;

import java.awt.geom.Area;
import java.util.Scanner;

class shape {
	// 定义面积周长私有成员变量
	double area;
	double perimeter;

//定义getter和setter方法
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

//定义shape的子类圆，长方形，正方形
class circle extends shape{
	 Scanner inputScanner=new Scanner(System.in)
	 radius=inputScanner.nextIn();
	 area=3.141926*radius;
			 
 }