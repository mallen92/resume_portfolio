public class CountPalindromes {
    public static void main(String[] args) {
        int numOfPalindromes = countPalindromes(0, 22);
        System.out.println(numOfPalindromes);
    }

    public static int countPalindromes(int num1, int num2) {
        boolean isPalindrome = false;
        int numOfPalindromes = 0;

        for(int i = num1; i <= num2; i++) {

            String numToCheck = Integer.toString(i);

            // If the numToCheck is 1 or 2 digits long, the for loop only needs to run once.
            // If the numToCheck is 3 or 4 digits long, the for loop only needs to run twice.
            // ...
            int numOfChecks = numToCheck.length() - (numToCheck.length()/2);

            for(int j = 0; j < numOfChecks; j++) {
                char forwardChar = numToCheck.charAt(j);
                char reverseChar = numToCheck.charAt(numToCheck.length() - (j+1));

                if(forwardChar == reverseChar) {
                    isPalindrome = true;
                } else {
                    isPalindrome = false;
                    break;
                }
            }

            if(isPalindrome) {
                numOfPalindromes++;
            }
        }

        return numOfPalindromes;
    }
}
