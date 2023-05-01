package test;

import java.util.Scanner;

public class MultiCatch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter zero or non-zero");
        int a = sc.nextInt();
        sc.close();
        try {
            int d = 42 / a;
            int c[] = { 1 };
            c[42] = 5;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
    }
}
