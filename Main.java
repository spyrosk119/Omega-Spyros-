import ss.week1.BrokenFibonacci;
import ss.week1.Gcd;

public class Main {

    static int IP24(int a){
        if (a /10 == 0){
            return a;
        } else {
            return Math.max((a%10),(IP24((a/10))));
        }
    }


    static boolean IP25(int[] array,int s, int end) {
        if ( s>= end ) {
            return true;
        } else {
            return (array[s]== array[end]) && IP25(array, s+1, end-1);
        }
    }

    static int IP26(int[] ar,int e, int start, int end) {
        int mid = ((start + end)/2);
        if (start>end) {
            return -1;
        }else {
            if (ar[mid] == e) {
                return mid;
            } else if (ar[mid] > e){
                end = (mid -1);
                        return IP26( ar , e, start ,end);
            } else {
                start = (mid +1);
                return IP26( ar , e, start ,end);
            }
        }
    }


    public static void main(String[] args) {
System.out.println(Gcd.gcd(12, 0));
System.out.println(IP24(48271));
System.out.println(IP25(new int[] {1,3,1},0,2));
System.out.println(IP26(new int[] {1,2,3,4},3,0,3));



System.out.println(BrokenFibonacci.fibonacci(1));
    }
}