
public class Main {

    /* Implement your solution inside this method.
       The ouput return value should be a string. */
    public String handle(int[] input) {
        // WRITE YOUR CODE HERE.
        return null;
    }



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
       input = input.replace("[", "").replace("]", "").trim();

        int[] inputArr;
        if (input.isEmpty()) {
            inputArr = new int[0];
        } else {
            String[] stringNumbers = input.split(",\\s*");
            inputArr = new int[stringNumbers.length];
            for (int i = 0; i < stringNumbers.length; i++) {
                inputArr[i] = Integer.parseInt(stringNumbers[i]);
            }
        }
        
        String output = new Main().handle(inputArr);
        System.out.println(output);
    }
}

