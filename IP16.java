package ss.week1;
import java.util.Scanner;
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
        Scanner bigdaddymanos = new Scanner(System.in);
        System.out.print("Enter a number my guy or miss or they/them");
        String line = bigdaddymanos.nextLine();
        System.out.println(SortNumbers(line));

    }
}