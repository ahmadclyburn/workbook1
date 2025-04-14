package com.pluralsight;
import java.util.*;
public class PromtedMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("just give the first num ");
        int firstNum = scanner.nextInt();

        System.out.println("whats your second ");
        int secondNum = scanner.nextInt();

        System.out.println("now pick one or get out of my face ");
        System.out.println("m-");
        System.out.println("d-");
        System.out.println("a-");
        System.out.println("s-");
        scanner.nextLine();
        String action = scanner.nextLine();

        if (action.equals("m")) {
            System.out.println("the classics never die do they. here ya go " + (firstNum * secondNum));
        }else if(action.equals("d")) {
            System.out.println("really a big fan of counter culture huh "+ (firstNum / secondNum));
        }else if(action.equals("a")) {
            System.out.println("simple as always i see "+ (firstNum + secondNum));
        }else if(action.equals("s")){
            System.out.println("daring choice i guess. your answer is " + (firstNum - secondNum));
                    }
                }
    }
