package com.gmail.oxa;

public class Circle extends Shape{

	private Point pointA;
	private Point pointB;
	
	public Circle(Point pointA, Point pointB) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
	}

	public Circle() {
		super();
	}
	
	private double getRadius (Point pointA, Point pointB) {
		double r = Math.sqrt(Math.pow((pointB.getX()-pointA.getX()), 2) +
				Math.pow((pointB.getY()-pointA.getY()), 2));
	return r;
	}
	
	@Override
	public double getPerimetr () {
		double circleLength = 2 * getRadius(pointA, pointB) * Math.PI;
		return circleLength;
	}
	
	@Override
	public double getArea () {
		double area = Math.PI * Math.pow(getRadius(pointA, pointB), 2);
		return area;
	}
	
	private String formatDoubleToString (double a, int n) {
		
		String form = "%." + n + "f";
		String result = String.format(form, a);
		return result;
	}
	
	@Override
	public String toString() {
		return "Circle [Circle's length = " + formatDoubleToString(getPerimetr(), 3) + 
				", Area = " + formatDoubleToString(getArea(), 3) + "]";
	}
	
	
}
