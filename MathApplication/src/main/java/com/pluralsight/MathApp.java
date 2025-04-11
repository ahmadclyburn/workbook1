
package com.pluralsight;
import java.util.Random;
import javax.print.attribute.standard.PrinterMakeAndModel;

public class MathApp {
    public static void main(String[] args) {
        // Question 1:
// declare variables here
// question:1
        double bobSalary = 150_000.00;
        double garySalary = 180_000.00;

        double highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The Highest Salary is:" + highestSalary);
//question 2:
        double carPrice = 25_000.05;
        double truckPrice = 45_00.07;

        double lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println("the lowest price is:" + lowestPrice);
//question:3
        double circleRadius = 78.98;
        double areaFormula = 3.14f * (circleRadius * circleRadius);

        System.out.println("Radius= " + areaFormula);
//question4:
        int num = 8;
        double squareRootFormula = (num * num);

        System.out.println("square root= " + squareRootFormula);
//question5:
        int upperNum = 89;
        int lowerNum = 53;

        int spaceFinder = (upperNum - lowerNum);
        System.out.println("space between is:" + spaceFinder);
//question 6:
        double negNum = -98.90;
        double absoluter = (negNum * -1);

        System.out.println("absolute is: " + absoluter);
//question 7:
        Random rand = new Random();
        int randomNum = rand.nextInt(1);
        System.out.println("random num= " + randomNum);

    }
}
