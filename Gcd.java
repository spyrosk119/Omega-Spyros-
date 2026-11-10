package ss.week1;

public class Gcd {

    /**
     *Using recursion, returns the gcd of 2 non negative integers
     * @param a
     * @param b
     * @return the gcd of a and b
     */
    public static int gcd (int a, int b) {
        if (b==0) {
            return a;
        } else {
            return gcd(b, (a % b));
        }

    }

}