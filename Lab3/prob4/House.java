package Lab3.Prob4;

public class House extends Property {
	private double lotSize;
	public House(Address address, double lotSize) {
		super(address);
		this.lotSize = lotSize;
	}

	public double computeRent(){
		return 0.1 * lotSize;
	}
}
