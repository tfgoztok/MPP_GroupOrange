package prob3B;

public class Circle {
	public double radius;

	public Circle(double r) {
		radius = r;
	}

	public double computeArea() {
		return Math.PI * radius * radius;
	}

}
