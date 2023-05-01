package test;

class MethNestTry {
    static int a, b;

    public static void main(String args[]) {
        a = args.length;
        try {
            b = 42 / a;
            subroutine();
        } catch (ArithmeticException e) {
            //System.out.println(e.getMessage());
            System.out.println("Division by zero");
        }
    }

    static void subroutine() {
        try {
            if (a == 1) {
                b = 42 / (a - a);
            }
            if (a == 2) {
                int c[] = { 1 };
                c[42] = 3;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds - 2");
        }
    }
}
