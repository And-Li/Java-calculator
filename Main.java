import java.util.Scanner;

class Main {
    public static void main(String[] args) {

            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter the expression, e.g.: 3+5");
            String newExp = myObj.nextLine();  // Read user input
            System.out.println("You want to calculate: " + newExp);  // Output user input
            char[] newExpArray = {newExp.charAt(0), newExp.charAt(1), newExp.charAt(2)};

            int first = newExpArray[0] - 48; // Set variables for number-action-number in the input expression
            String action = String.valueOf(newExpArray[1]);
            int second = newExpArray[2] - 48;

            //int[] numberBorders = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Set borders for input numbers
            //char[] actionBorders = {'-', '+', '/', '*'}; // Set borders for input arithmetic actions
            //System.out.println(Arrays.toString(numberBorders));
            //System.out.println(Arrays.toString(actionBorders));
            //System.out.print(numberBorders[0]-numberBorders[1]);
            //System.out.print(actionBorders[0]);

        switch (action) {
            case "-" -> System.out.println(first - second);
            case "+" -> System.out.println(first + second);
            case "/" -> {
                System.out.println((float) first / (float) second);
            }
            case "*" -> System.out.println(first * second);
        }


        }}


