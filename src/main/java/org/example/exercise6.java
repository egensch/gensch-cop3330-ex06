/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Emily Gensch
 */
package org.example;
import java.util.Calendar;
import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner ages = new Scanner(System.in);

        System.out.print("What is your current age? ");
        int num1 = ages.nextInt();

        System.out.print("At what age would you like to retire? ");
        int num2 = ages.nextInt();

        int retireAge = num2 - num1;
        System.out.println("You have " + retireAge + " years left until you can retire.");

        int curYear = Calendar.getInstance().get(Calendar.YEAR);
        int retYear = curYear + retireAge;
        System.out.println("It's " + curYear + ", so you can retire in " + retYear + "."  );
    }
}
