public class PalindromeMethods {
    public static void main(String[] args) {
        listPalindromes(72, 122);
    }
    public static void listPalindromes(int num1, int num2) {
        int arrayLength = countPalindromes(num1, num2);
        int index = 0;

        String[] palinList = new String[arrayLength];

        for(int i = num1; i <= num2; i++) {
            if(isNumPalindrome(i)) {
                palinList[index] = Integer.toString(i);
                index++;
            }
        }

        printList(palinList);
    }
    public static int countPalindromes(int num1, int num2) {
        int numOfPalindromes = 0;

        for(int i = num1; i <= num2; i++) {
            if(isNumPalindrome(i)) {
                numOfPalindromes++;
            }
        }

        return numOfPalindromes;
    }
    public static boolean isNumPalindrome(int numToCheck) {
        String numAsString = Integer.toString(numToCheck);

        /* E.g. 5 & 6 chars in the string should result in only 3 checks.
           (for odd numbers, the final check is applied to the same
           middle char.) */
        int numOfChecks = numAsString.length() - (numAsString.length()/2);

        boolean isPalindrome = false;

        for(int j = 0; j < numOfChecks; j++) {
            /* This charAt() is the "forward pointer" which
               starts at the beginning of the string and moves
               forward toward the middle of the string */
            char forwardChar = numAsString.charAt(j);

            /* As the "forward pointer" moves forward,
               This charAt() pointer starts at the end of the string
               and moves backward toward the middle of it. */
            char reverseChar = numAsString.charAt(numAsString.length() - (j+1));

            if(forwardChar == reverseChar) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }
    public static void printList(String[] array) {
        System.out.print("[");

        for(int i = 0; i < array.length; i++) {
            if (i == array.length-1) {
                System.out.print(array[i]);
            }
            else {
                System.out.print(array[i] + ", ");
            }
        }

        System.out.println("]");
    }

}
