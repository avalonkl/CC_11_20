package core;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        System.out.print("Enter a number:  ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); input.close();
        System.out.print(number + " is ");

        // Start coding
        int temp = number;
        int palindrom = 0;

        while (temp > 0){
            palindrom *= 10;
            palindrom += temp % 10;
            temp /= 10;
        }

        System.out.print(palindrom == number ? "palindrom" : "not palindrom");
        // End coding
    }
}
