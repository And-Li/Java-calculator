import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter the expression, e.g.: 3+5");
            String newExp = myObj.nextLine();  // Read user input
            System.out.println("You want to calculate: " + newExp);  // Output user input

            int first = newExp.charAt(0); // Set variables for number-action-number in the input expression
            char action = newExp.charAt(1);
            int second = newExp.charAt(2);

            int[] numberBorders = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Set borders for input numbers
            char[] actionBorders = {'-', '+', '/', '*'}; // Set borders for input arithmetic actions
            //System.out.println(Arrays.toString(numberBorders));
            //System.out.println(Arrays.toString(actionBorders));
            //System.out.print(numberBorders[0]-numberBorders[1]);
            //System.out.print(actionBorders[0]);
            if (action == '-') {System.out.println(first-second);}
        }



        }


