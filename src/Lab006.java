import java.util.Scanner;

/**
 * @author crazyne55
 * 3/1/2023 @ 2042
 */
public class Lab006 {
    public int m;
    public int n;

    /**
     * Constructor for Lab006 class
     * @param n integer
     * @param m integer
     */
    public Lab006(int n, int m) { // originally was m, n but swapped for convenience
        this.n = n;
        this.m = m;
    }
    /**
     * Checks if local n is evenly divisible by local m.
     * @return Boolean
     */
    public boolean isDivisible() {
        if (n % m == 0) return true;
        return false;
    }

    /**
     * entry point of code.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 integers: ");
        int in1 = Integer.parseInt(scanner.nextLine());
        int in2 = Integer.parseInt(scanner.nextLine());
        Lab006 lab = new Lab006(in1, in2);
        System.out.printf("%s %s divisible by %s.", in1, (lab.isDivisible()?"is":"is not"), in2);
    }
}
