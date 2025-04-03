package prob3A;

public class Cylinder {
	private double height;
	public double radius;

	public Cylinder(double h, double r) {
		height = h;
		radius = r;
	}

	public Cylinder(double r) {
		radius = r;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double h) {
		height = h;
	}

	public double computeVolume() {
		return Math.PI * radius * radius * height;
	}

}
