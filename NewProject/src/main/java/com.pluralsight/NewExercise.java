
package com.pluralsight;

import java.util.Scanner;

public class NewExercise {
    public static void main(String[] args) {
      int vin = 8_763_873;
      String makeModel = "toyota camry";
      String vehicleColor = "black";
      boolean towingPack = false;
      int odometer = 100_500;
      double price = 2_000.00;
      String quality = "c";
      String phoneNumber = "8038089899";
      int ssn = 898-98-9099;
      int zipcode = 98673;

        Scanner Scanner = new Scanner(System.in);

        System.out.print("What info do you want:");

        String carInfo = Scanner.next();

        if(carInfo.equals("vin")){
          System.out.println(vin);
        }else if (carInfo.equals("make and model")) {
          System.out.println(makeModel);
        }else if (carInfo.equals("Color")) {
          System.out.println(vehicleColor);
        }else if (carInfo.equals("towing")) {
          System.out.println(towingPack);
        }else if (carInfo.equals("odometer")) {
          System.out.println(odometer);
        }else if (carInfo.equals("price")) {
          System.out.println(price);
        }else if (carInfo.equals("quality")) {
          System.out.println(quality);
        }else if (carInfo.equals("phone number")){
          System.out.println(phoneNumber);
        }else if (carInfo.equals("ssn")) {
          System.out.println(ssn);
        }else if (carInfo.equals("zip code")){
          System.out.println(zipcode);
          }

      }

    }

