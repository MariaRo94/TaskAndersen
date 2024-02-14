import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String firstStr = myObj.nextLine();
        String secondStr = myObj.nextLine();
        if (firstStr.equalsIgnoreCase(secondStr)) {
            System.out.println("Strings are equal: " + firstStr + " " + secondStr);
        } else {
            System.out.println("Strings are NOT equal" + firstStr + " " + secondStr);
        }
    }
}
