package core;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        System.out.print("Enter a digits:  ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); input.close();
        System.out.print("Sum of the digits: ");

        // Start coding
        int sum = 0;
        while (number > 0){
            sum += number % 10;
            number = number / 10;
        }
        System.out.print(sum);
        // End coding
    }
}
