package prob3A;

public class Circle extends Cylinder {
	
	public Circle(double r) {
		super(r);
	}

	public double computeArea() {
		return Math.PI * radius * radius;
	}

}
