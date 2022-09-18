import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the expression, e.g.: 3 + 5");
        String userInput = scanner.nextLine();  // Read user input
        String [] userInputSplit = userInput.split(" "); // Splits input into number/action/number, in string format
        String first = userInputSplit[0]; //initialize first number
        String action = userInputSplit[1];
        String second = userInputSplit[2];

        

        //Should be done after Roman to arabic transfer:
        int firstInt = Integer.parseInt(first); //transfers first into an integer
        int secondInt = Integer.parseInt(second); // transfers second into an integer

        //Detects if any of +-/* is in the user's input & throws exception if isn't:
        if (action.contains("-")||
                (action.contains("+"))||
                (action.contains("/"))||
                (action.contains("*")))
        {System.out.print("");}
        else {throw new Exception("No action signs detected");}

        /*if (first.contains("1")){
            int firstInt = Integer.parseInt(first);
            System.out.println(firstInt);
        }*/

        // switch to perform actions +-/*
        switch (action) {
            case "-" -> {
                int result = firstInt - secondInt;
                System.out.println(result);
                break;
            }
            case "+" -> {
                int result = firstInt + secondInt;
                System.out.println(result);
                break;
            }
            case "/" -> {
                int result = firstInt / secondInt;
                System.out.println(result);
                break;
            }
            case "*" -> {
                int result = firstInt * secondInt;
                System.out.println(result);
                break;
            }

        //detects Roman numbers:
        /*if (first.contains("i")||first.contains("v")||first.contains("x")||first.contains("l")){System.out.println("Roman 1 detected");}
        if (second.contains("i")||second.contains("v")||second.contains("x")||second.contains("l")){System.out.println("Roman 2 detected");}*/

    }}}
