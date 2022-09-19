import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

class Main {
    public static int calc(String input) throws Exception {
        Scanner scanner = new Scanner(System.in);  // Creates a Scanner object
        System.out.println("Enter the expression, e.g.: 3 + 5");
        input = scanner.nextLine();  // Reads user input
        String [] userInputSplit = input.split(" "); // Splits input into number/action/number, in string format
        String first = userInputSplit[0]; // Initializes first number
        String action = userInputSplit[1];// Initializes the calculation sign
        String second = userInputSplit[2];// Initializes second number

        // These arrays are used for detecting if both input numbers are of one type (arabic or roman):
        String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] arabic ={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        // Checks if input numbers are NOT floats:
        if (first.contains(".")||(second.contains(".")))
        {throw new Exception("No floats allowed!");
        }
        // Checks if both input numbers are arabic or roman:
        if ((Arrays.asList(roman).contains(first)&&Arrays.asList(arabic).contains(second))||
                ((Arrays.asList(arabic).contains(first))&&(Arrays.asList(roman).contains(second)))){
            throw new Exception("Both numbers should be either arabic or roman");
        }
        // Laziest way to make arabic numbers out of roman ones:
        switch (first){
            case "I" -> first = "1";
            case "II" -> first = "2";
            case "III" -> first = "3";
            case "IV" -> first = "4";
            case "V" -> first = "5";
            case "VI" -> first = "6";
            case "VII" -> first = "7";
            case "VIII" -> first = "8";
            case "IX" -> first = "9";
            case "X" -> first = "10";
        }
        switch (second){
            case "I" -> second = "1";
            case "II" -> second = "2";
            case "III" -> second = "3";
            case "IV" -> second = "4";
            case "V" -> second = "5";
            case "VI" -> second = "6";
            case "VII" -> second = "7";
            case "VIII" -> second = "8";
            case "IX" -> second = "9";
            case "X" -> second = "10";
        }

        // Converts input numbers from string to int:
        int firstInt = Integer.parseInt(first); //first into an integer
        int secondInt = Integer.parseInt(second); //second into an integer

        // Checks if input numbers are in 1-10 range:
        if (1 > firstInt || 1 > secondInt)
        {throw new Exception("Too small");}
        if (firstInt > 10 || secondInt > 10)
        {throw new Exception("Too big");}

        // Detects if any of +-/* is in user's input or throws exception:
        if (action.contains("-")||
                (action.contains("+"))||
                (action.contains("/"))||
                (action.contains("*")))
        {System.out.print("");
        }
        else {throw new Exception("No calculation sign detected");
        }
        int x = 0;
        if (Objects.equals(action, "-")) {
            x = (firstInt - secondInt);
        } else if (Objects.equals(action, "+")) {
            x = (firstInt + secondInt);
        } else if (Objects.equals(action, "/")) {
            x = (firstInt / secondInt);
        } else if (Objects.equals(action, "*")) {
            x = (firstInt * secondInt);
        }
        System.out.println(x);
        return (x);
    }

    public static void main(String[] args) throws Exception {
        Scanner scannerNew = new Scanner(System.in);
        calc(String.valueOf(scannerNew));

    }

}

