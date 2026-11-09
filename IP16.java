package ss.week1;

import java.util.Arrays;

public class IP16 {

    public static String SortNumbers(String a) {

        String total ="";
        String[] split = a.trim().split("\\s+");
        int[] numbers = new int[split.length];
        for (int i = 0; i <= (split.length - 1); i++) {
            numbers[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(numbers);
        for (int i = 0; i <= (split.length - 1); i++) {
            total = total + numbers[i] + " ";
        }
        return total;

    }
    public static void main(String[] args) {
        System.out.println(SortNumbers("3374 33"));
    }
}