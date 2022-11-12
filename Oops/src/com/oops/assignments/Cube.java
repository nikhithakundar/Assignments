package com.oops.assignments;
abstract class Shape_1 {
	abstract void draw();
}
class Line_shape extends Shape_1{
	 void draw()
	 {
		 System.out.println("Drawing Line");
	 }
}
class Rectangle_shape extends Shape_1{
	 void draw()
	 {
		 System.out.println("Drawing Rectangle");
	 }
}
public class Cube extends Shape_1 {
	void draw()
	 {
		 System.out.println("Drawing Cube");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line_shape l= new Line_shape();
		l.draw();
		Rectangle_shape r= new Rectangle_shape();
		r.draw();
		Cube c =new Cube();
		c.draw();
	}

}
