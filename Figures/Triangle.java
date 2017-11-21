package com.gmail.oxa;

public class Triangle extends Shape {

	private Point pointA;
	private Point pointB;
	private Point pointC;
		
	public Triangle(Point pointA, Point pointB, Point pointC) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}

	public Triangle() {
		super();
	}

	private double getSide (Point pointA, Point pointB) {
		double ab = Math.sqrt(Math.pow((pointB.getX()-pointA.getX()), 2) +
				Math.pow((pointB.getY()-pointA.getY()), 2));
		return ab;
	}
		
	@Override
	public double getPerimetr() {
		double perimetr = getSide(pointA, pointB) + getSide(pointB, pointC) + getSide(pointA, pointC);
		return perimetr;
	}
	
	@Override
	public double getArea () {
		double semiPerimetr = getPerimetr() / 2;
		double area = Math.sqrt(semiPerimetr * (semiPerimetr - getSide(pointA, pointB)) * 
				(semiPerimetr - getSide(pointB, pointC)) * semiPerimetr - getSide(pointA, pointC));
		return area;
	}
	
	private String formatDoubleToString (double a, int n) {
		
		String form = "%." + n + "f";
		String result = String.format(form, a);
		return result;
	}
	
	@Override
	public String toString() {
		String text = "Triangle [Perimetr = " + formatDoubleToString(getPerimetr(), 3) +
				", Area = " + formatDoubleToString(getArea(), 3) + "]";
		return text;
	}
	
	
}
