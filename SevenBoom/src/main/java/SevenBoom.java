public class SevenBoom {
    public String sayBoom(int[] arr) {
        boolean foundSeven = false;
        String output = "There is no 7 in the array.";

        for(Integer num: arr) {
            String arrElString = num.toString();

            for(int i=0; i < arrElString.length(); i++) {
                if(arrElString.charAt(i) == '7') {
                    foundSeven = true;
                    break;
                }
            }

            if (foundSeven) {
                output = "Boom!";
                break;
            }
        }

        return output;
    }
}
