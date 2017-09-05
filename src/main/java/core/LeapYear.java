package core;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        System.out.print("Enter a year: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt(); input.close();
        System.out.print(year + " is ");

        // Start coding
        System.out.print(year % 4 == 0 ? "leap" : "not leap");
        // End coding
    }
}