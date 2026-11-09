package ss.week1;

public class IP18 {

    public static void data(int[] a) {
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <=80) {
                total = total ;
            }else if (a[i]<=90) {
                total = total + 50;
            } else if (a[i]<= 100) {
                total = total + 100;
            } else {
                total = total + 200;
            }
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        data(new int[] {124, 988, 34});
    }
}