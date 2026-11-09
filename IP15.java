package ss.week1;
import java.util.Scanner;

public class IP15 {

    public static String trans(String word) {
        String lowerCase = word.toLowerCase();
        String result = "";
        for (int i = 0; i < lowerCase.length(); i++) {
            switch (lowerCase.charAt(i)) {
                case 'a':
                    result = result + "2";
                    break;
                case 'b':
                    result = result + "2";
                    break;
                case 'c':
                    result = result + "2";
                    break;
                case 'd':
                    result = result + "3";
                    break;
                case 'e':
                    result = result + "3";
                    break;
                case 'f':
                    result = result + "3";
                    break;
                case 'g':
                    result = result + "4";
                    break;
                case 'h':
                    result = result + "4";
                    break;
                case 'i':
                    result = result + "4";
                    break;
                case 'j':
                    result = result + "5";
                    break;
                case 'k':
                    result = result + "5";
                    break;
                case 'l':
                    result = result + "5";
                    break;
                case 'm':
                    result = result + "6";
                    break;
                case 'n':
                    result = result + "6";
                    break;
                case 'o':
                    result = result + "6";
                    break;
                case 'p':
                    result = result + "7";
                    break;
                case 'q':
                    result = result + "7";
                    break;
                case 'r':
                    result = result + "7";
                    break;
                case 's':
                    result = result + "7";
                    break;
                case 't':
                    result = result + "8";
                    break;
                case 'u':
                    result = result + "8";
                    break;
                case 'v':
                    result = result + "8";
                    break;
                case 'w':
                    result = result + "9";
                    break;
                case 'x':
                    result = result + "9";
                    break;
                case 'y':
                    result = result + "9";
                    break;
                case 'z':
                    result = result + "9";
                    break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Input a word");
Scanner input = new Scanner(System.in);
String word = input.nextLine();
System.out.println(trans(word));
    }

}