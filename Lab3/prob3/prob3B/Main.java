package prob3B;

public class Main {

	public static void main(String[] args){
		// Cylinder cr1 = new Circle(12.0);
        	Cylinder cy1 = new Cylinder(5.5, 10.0);
        	Circle cr2 = new Circle(11.0);

        	// System.out.println(cr1.computeVolume()); // worng volume for circle because of incorrect implementation
        	System.out.println(cy1.computeVolume());
        	System.out.println(cr2.computeArea());
	}

}
