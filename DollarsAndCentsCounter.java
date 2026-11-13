package ss.week2;

/**
 * This class records an amount of money as dollars and cents.
 */
public class DollarsAndCentsCounter {

    /**
     * Return the number of whole dollars.
     * @return the number of whole dollars
     */
    //@ ensures \result >= 0;
    //@ pure
    public int getDollars() {
        return d;

    }

    /**
     * Return the amount of cents.
     * @return the amount of cents
     */
    //@ ensures \result >= 0 && \result < 100;
    //@ pure
    public int getCents() {
        return c;
    }

    /**
     * Add the specified amount of dollars and cents to this counter.
     * @param dollars the amount of dollars to add
     * @param cents the amount of cents to add
     */
    /*@ ensures getDollars() * 100 + getCents() ==
          \old(getDollars() * 100 + getCents()) + dollars * 100 + cents;
      @ */
    public void add(int dollars, int cents) {
        d = d + dollars;
        c = c + cents;
        if (c >=100) {
            d = d + c/100;
            c  = c % 100;
        }

    }

    int d;
    int c;

    /**
     * Reset this counter to 0.
     */
    //@ ensures getDollars() == 0 && getCents() == 0;
    public void reset() {
        d = 0;
        c = 0;
    }
}
