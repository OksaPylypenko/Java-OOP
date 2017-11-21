package com.gmail.oxa;

public class Rectangle extends Shape{

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;
	
	public Rectangle(Point pointA, Point pointB, Point pointC, Point pointD) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		this.pointD = pointD;
	}

	public Rectangle() {
		super();
	}
	
	private double getSide (Point pointA, Point pointB) {
		double ab = Math.sqrt(Math.pow((pointB.getX()-pointA.getX()), 2) +
				Math.pow((pointB.getY()-pointA.getY()), 2));
	return ab;
	}
	
	@Override
	public double getPerimetr() {
		double perimetr = 0;
		if ((getSide(pointA, pointB) == getSide(pointC, pointD)) && 
				(getSide(pointA, pointC) == getSide(pointB, pointD))) {
		perimetr = getSide(pointA, pointB) * 2 + getSide(pointA, pointC) * 2;
		} 
		return perimetr;
	}
	
	@Override
	public double getArea() {
		double area = 0;
		if ((getSide(pointA, pointB) == getSide(pointC, pointD)) && 
				(getSide(pointA, pointC) == getSide(pointB, pointD))) {
		area = getSide(pointA, pointB) * getSide(pointA, pointC);
		} 
		return area;
	}
	
	private String formatDoubleToString (double a, int n) {
		
		String form = "%." + n + "f";
		String result = String.format(form, a);
		return result;
	}
	
	@Override
	public String toString() {
		return "Rectangle [Perimetr = " + formatDoubleToString(getPerimetr(), 3) + 
				", Area = " + formatDoubleToString(getArea(), 3) + "]";
	}
	
	
}
