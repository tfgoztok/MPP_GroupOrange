package prob1.partB;

import java.util.function.Supplier;

class NonfunctionalRandom {
	static class CRandom implements Supplier<Double> {
		@Override
		public Double get() {
			return Math.random();
		}
	}

	public static void main(String[] args) {
		CRandom nfr = new CRandom();
		System.out.println(nfr.get());
	}

}
