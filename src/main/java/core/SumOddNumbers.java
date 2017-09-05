package core;

import java.util.Scanner;

public class SumOddNumbers {

    public static void main(String[] args) {

        System.out.print("Enter a number:  ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); input.close();
        System.out.print("Sum of odd numbers: ");

        // Start coding
        int sum = 0;
        while (number > 0){
            if ((number & 1) == 1){sum += number;}
            number--;
        }
        System.out.print(sum);
        // End coding
    }
}
