package ocm.pluralsight;

import java.util.*;
public class print {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("whats your name");
        String name = scanner.nextLine();

        System.out.println("how many hours have you worked? ");
        float firstNum = scanner.nextFloat();

        System.out.println("what is your hourly wage ");
        float secondNum = scanner.nextFloat();

        float grossPay = (firstNum * secondNum);

        System.out.printf("%s your gross pay is $%.2f", name, grossPay);

    }
}
