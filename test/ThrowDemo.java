package test;

public class ThrowDemo {
    static void subroutine() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Caught Null pointer exception:  " + e);
            throw e;
        }
    }

    public static void main(String args[]) {
        try {
            subroutine();
        } catch (NullPointerException e) {
            System.out.println("Recaught: " + e);
        }
    }
}
