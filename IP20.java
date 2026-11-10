package ss.week1;

public class IP20 {
    /**
     *
     * @param a (integer array)
     * @return (return a new array containing only the unique values, in the order of their first appearance)
     */
    public static int[] newArray(int[] a) {

        int[] keptNumbers = new int[a.length];   // the numbers we keep, in reverse order
        int keptCount = 0;                       // how many we've kept so far

        for (int i = a.length - 1; i >= 0; i--) {
            boolean alreadySeen = false;         // haven't found a copy yet

            for (int j = i - 1; j >= 0; j--) {   // look left
                if (a[j] == a[i]) {
                    alreadySeen = true;          // found a copy on the left
                }
            }

            if (!alreadySeen) {                  // no copy on the left, so keep it
                keptNumbers[keptCount] = a[i];
                keptCount++;
            }
        }

        int[] answer = new int[keptCount];       // exact size, no empty slots
        for (int k = 0; k < keptCount; k++) {
            answer[k] = keptNumbers[keptCount - 1 - k];   // flip the order
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] result = newArray(new int[] {3,67,1,2,3});
        for (int i=0; i<result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}