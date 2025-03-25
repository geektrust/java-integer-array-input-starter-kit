
public class Main {

    /*
     * *****************************************************************************
     * DO NOT EDIT THIS CODE.
     * *****************************************************************************
     * 
     * This code is used to boostrap your solution to be checked for correctness by
     * our system.
     */
    public static void main(String[] args) {
        String input = args[0];
        String[] stringNumbers = input.replace("[", "").replace("]", "").split(",\\s*");

        int[] inputArr = new int[stringNumbers.length];
        for (int i = 0; i < stringNumbers.length; i++) {
            inputArr[i] = Integer.parseInt(stringNumbers[i]);
        }
        String output = new Solution().handle(inputArr);
        System.out.println(output);
    }
}
