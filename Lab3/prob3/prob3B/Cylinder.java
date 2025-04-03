package prob3B;

public class Cylinder {
	private double height;
	private Circle c;

	public Cylinder(double h, double r) {
		height = h;
		c = new Circle(r);
	}

	public double getHeight() {
		return height;
	}

	public double getRadius() {
		return c.radius;
	}

	public void setRadius(double r) {
		c.radius = r;
	}

	public void setHeight(double h) {
		height = h;
	}

	public double computeVolume() {
		return c.computeArea() * height;
	}

}
