package com.gmail.oxa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point a = new Point (3, 4);
		Point b = new Point (3, 8);
		Point c = new Point (9, 4);
		Point d = new Point (9, 8);
		
		Triangle tr = new Triangle(a, b, c);
		System.out.println(tr);
		
		Rectangle rec = new Rectangle(a, b, c, d);
		System.out.println(rec);
		
		Circle cir = new Circle(a, b);
		System.out.println(cir);
	}

}
