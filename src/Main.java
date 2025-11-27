import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        UI.programBanner();
        double electricityBill = electricityComputer();
        System.out.println(electricityBill);
    }

    public static void fixedBills() {
        HashMap<String, Double> fixedBills = new HashMap<>();

        //Fixed Bills that will be added to the total rent for every month. 
        fixedBills.put("Monthly Rent",  4500.0);
        fixedBills.put("Water Bill",  150.0);
        fixedBills.put("Internet Bill",  320.0);
    }

    public static double electricityComputer() {
        double prevReading = 0.0;
        double presentReading = 0.0;
        double ratePerKW = 0.0;
        try {
            System.out.print("ENTER PRESENT ELECTRICITY METER READING>> ");
            presentReading = sc.nextDouble();

            System.out.print("ENTER PREVIOUS ELECTRICITY METER READING>> ");
            prevReading = sc.nextDouble();
            double kiloWattConsumed = presentReading - prevReading;

            System.out.print("ENTER THIS MONTH'S RATE PER KILLOWATT OF ELECTRICITY>>");
            ratePerKW = sc.nextDouble();
            double electricityBill = ratePerKW * kiloWattConsumed;
            return electricityBill;
        }
        catch (InputMismatchException e) {
            //TODO: finalize the excpetion handler
        }
        return 0;
    }
}
