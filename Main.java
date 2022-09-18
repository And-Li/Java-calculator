import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the expression, e.g.: 3 + 5");
        String userInput = scanner.nextLine();  // Read user input
        String [] userInputSplit = userInput.split(" "); // Splits input into number/action/number, in string format
        String first = userInputSplit[0]; //initialize first number
        String action = userInputSplit[1];
        String second = userInputSplit[2];

        if (first.contains("1")){System.out.println("it's an arabic number");}

        /*switch (action) {
            case "-" -> {
                int result = first - second;
                System.out.println(result);
                break;
            }
            case "+" -> {
                int result = first + second;
                System.out.println(result);
                break;
            }
            case "/" -> {
                int result = first / second;
                System.out.println(result);
                break;
            }
            case "*" -> {
                int result = first * second;
                System.out.println(result);
                break;
            }*/ // switches actions +-/*

        //detects Roman numbers:
        if (first.contains("i")||first.contains("v")||first.contains("x")||first.contains("l")){System.out.println("Roman 1 detected");}
        if (second.contains("i")||second.contains("v")||second.contains("x")||second.contains("l")){System.out.println("Roman 2 detected");}

    }}
