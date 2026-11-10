package ss.week1;

public class IP19 {

    /**
     *Given an array of daily temperatures, determines the length of the longest increasing streak:
     * consecutive days on which each temperature is higher than the one before.
     * @param a
     */
    public static void data(int[] a) {
        int total =1;
        int max = 1;
        if (a.length-1 == 0) {
            total = 1;
        } else {
             max = 1;
            for (int i = 0; i < a.length - 1; i++) {

                if (a[i]<a[i+1]) {
                total = total +1;
                } else {
                    total =1;
                }
                if (total>max){
                    max = total;
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        data(new int[] {2,3,4,1,2,3,4,5});
    }
}