import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Integer first = Integer.valueOf(myObj.nextLine());
        Integer second = Integer.valueOf(myObj.nextLine());
        String action = myObj.nextLine();
        if (first > second) {
            System.out.println(first + " > " + second);
        } else if (first < second) {
            System.out.println(first + " < " + second);
        } else {
            System.out.println(first + " == " + second);
        }

        String result = switch (action) {
            case "*" -> "The result of action " + action + " is " + (first * second);
            case "/" -> {
                if (second != 0) {
                    yield "The result of action " + action + " is: " + (first / second);
                }
                yield "Not supported operation. Cannot divide  by zero";
            }
            case "+" -> "The result of action " + action + "is: " + (first + second);
            case "-" -> "The result of action " + action + "is: " + (first - second);
            default -> "Action not supported";
        };
        System.out.println(result);
    }
}
