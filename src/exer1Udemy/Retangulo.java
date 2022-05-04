package exer1Udemy;

public class Retangulo {
	private double heigth;
	private double width;

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double calculateArea() {
		double area = heigth * width;
		return area;
	}

	public double calculatePerimeter() {
		double perimeter = ((2 * heigth) + (2 * width));
		return perimeter;
	}

	public double calculateDiagonal() {
		double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(heigth, 2));
		return diagonal;
	}

}
