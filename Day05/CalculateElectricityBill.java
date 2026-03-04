package Day05;
import java.util.Scanner;

public class CalculateElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Electricity Units: ");
        int number = scanner.nextInt();
        if (number < 100) {
            number *= 5.88;

        } else if (number > 100 && number < 300) {
            number *= 11.46;

        } else if (number > 300 && number < 500) {
            number *= 16.64;


        } else {
            number *= 17.81;
        }
        System.out.println("Your Electricity Bill is: " + number);

        Scanner close;
    }
}