class MethNestTry {

	static void nestTry(int a) {
		try {
			if (a == 1) {
				int b = 42 / (a - a);
			}
			if (a == 2) {
				int c[] = { 1 };
				c[42] = 99;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index oob: " + e);
		}

	}

	public static void main(String args[]) {
		try {
			int a = args.length;
			int b = 42 / a;
			System.out.println("a = " + a);

			nestTry(a);
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero: " + e);
		}
	}
}