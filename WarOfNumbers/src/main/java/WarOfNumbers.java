import java.util.Arrays;

public class WarOfNumbers {
    public static int subtract(int[] arr) {
        /* We can separate the passed-in array into two
        * arrays; one for even nums and the other for odd.
        * To do this, we first need to create counters for
        * the size of each array. */
        int evenNumCount = 0;
        int oddNumCount = 0;

        /* If a number is even, increment the even counter;
        * otherwise, increment the odd counter.  */
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                evenNumCount++;
            }
            else {
                oddNumCount++;
            }
        }

        /* Initialize each array using the counters to initialize the size. */
        int[] evenNumArray = new int[evenNumCount];
        int[] oddNumArray = new int[oddNumCount];

        /* Create separate indices for each array. When we iterate through the
        * passed-in array, not every element in it is guaranteed to go inside
        * each of the "sub-arrays." */
        int evenArrayIndex = 0;
        int oddArrayIndex = 0;

        /* Loop through the main array, placing each element in the
        * respective sub-array. */
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                evenNumArray[evenArrayIndex] = arr[i];
                evenArrayIndex++;
            }
            else {
                oddNumArray[oddArrayIndex] = arr[i];
                oddArrayIndex++;
            }
        }

        /* Calculate the sums of each array. */
        int evenSum = Arrays.stream(evenNumArray).sum();
        int oddSum = Arrays.stream(oddNumArray).sum();

        /* Find, then return, the difference of the two sums.
        * We don't want a negative difference, so we need
        * to figure out which is bigger, so we can subtract the smaller
        * sum from it. */
        int diff = 0;

        if(evenSum > oddSum)
            diff = evenSum - oddSum;
        if(oddSum > evenSum)
            diff = oddSum - evenSum;

        return diff;
    }
}