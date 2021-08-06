/**
 *
 */
public final class MinMax {
    private MinMax() {
    }

    /**
     *
     */
    static class FindMinMax {

        /**
         *
         */
        private int minimum;
        /**
         *
         */
        private int maximum;
    }

    static FindMinMax func1(final int[] arr, final int n) {
        FindMinMax call = new FindMinMax();
        int i;

        if (n == 1) {
            call.maximum = arr[0];
            call.minimum = arr[0];
            return call;
        }

        if (arr[0] > arr[1]) {
            call.maximum = arr[0];
            call.minimum = arr[1];
        } else {
            call.maximum = arr[1];
            call.minimum = arr[0];
        }

        for (i = 2; i < n; i++) {
            if (arr[i] > call.maximum) {
                call.maximum = arr[i];
            } else if (arr[i] < call.minimum) {
                call.minimum = arr[i];
            }
        }

        return call;
    }

    /**
     * @param args This is a main method
     */
    public static void main(final String[] args) {
        int[] arr = {1000, 11, 445, 1, 330, 3000};
        int s = 6;
        FindMinMax call = func1(arr, s);
        System.out.printf("\nMinimum is %d", call.minimum);
        System.out.printf("\nMaximum is %d", call.maximum);
    }
}

