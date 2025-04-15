package com.pluralsight;
import java.util.*;
public class TwoNumbersMethod {
    public static int addingNums(int num1, int num2){
    return num1 + num2;
    }

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("whats num1 ");
        int num1 = scanner.nextInt();

        System.out.println("whats num2");
        int num2 = scanner.nextInt();

        int result = addingNums(num1, num2);

        System.out.println("your sum is " + result);
    }
}
