package prob2;

public class ArithmeticExpr {

	sealed interface Expr permits Constant, Add, Multiply {
		int eval();
	}

	record Constant(int val) implements Expr {
		@Override
		public int eval() {
			return val;
		}
	}

	record Add(Expr left, Expr right) implements Expr {
		@Override
		public int eval() {
			return left.eval() + right.eval();
		}
	}

	record Multiply(Expr left, Expr right) implements Expr {
		@Override
		public int eval() {
			return left.eval() * right.eval();
		}
	}

	 public static int eval(Expr expr) {
		 return switch (expr) {
            		case Constant c -> c.val();
            		case Add a -> eval(a.left()) + eval(a.right());
            		case Multiply m -> eval(m.left()) * eval(m.right());
        		};
    	}

	public static void main(String[] args) {
		// (2 + 3) * 4
		Expr expr = new Multiply(
            	new Add(new Constant(2), new Constant(3)),
            	new Constant(4));

		int result1 = expr.eval();
		System.out.println(result1);
		
		int result2 = eval(expr);
		System.out.println(result2);
	}

}
