import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the expression, e.g.: 3+5");
        String newExp = myObj.nextLine();  // Read user input
        char[] newExpArray = {newExp.charAt(0), newExp.charAt(1), newExp.charAt(2)};

        //here needs to be a switch to transfer Roman input into arabic numbers
        //here needs if array.length > 3 need to pop element 1 & 3
        
        int first = newExpArray[0] - 48; // Set variables for number-action-number in the input expression
        String action = String.valueOf(newExpArray[1]);
        int second = newExpArray[2] - 48; //Somehow the number needs to be reduced by 48; it works well, I'll leave it like that
        System.out.println(newExpArray);




        switch (action) {
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
                float result = (float) first / (float) second;
                System.out.println(result);
                break;
            }
            case "*" -> {
                int result = first * second;
                System.out.println(result);
                break;
            }

        }


    }}
