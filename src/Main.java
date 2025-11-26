import java.util.Scanner;

public class Main {
    final static Scanner sc = new Scanner(System.in);
    static Object[][] fixedBills = {
        {"Monthly Rent", "Water Bill", "Internet Bill" },
        {4500, 150, 320}
    };
    public static void main(String[] args) {
        System.out.println("Will there be any changes in the fixed bills? (y/n)>>");
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("y")) {} //moves forward to the dynamic billing
        else {changeFixedVariables();} //proceed to the section where the user can change the values of the fixed variables
    }

    public static void changeFixedVariables() {
        //#TODO: make the method that makes it possible to change the arrays.
    }
}
