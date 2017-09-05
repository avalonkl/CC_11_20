package core;

import java.util.Scanner;

public class SexyPrimes {

    public static boolean isPrime (int number){
        for (int i = number - 1; i > 1; i --){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.print("Enter a number:  ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); input.close();
        System.out.print("Sexy Primes are: ");

        // Start coding
        for (int i = 0; i <= number; i ++){
            if (isPrime(i) && isPrime(i + 6)){
                System.out.println("(" + i + " " + (i + 6) + ")");
            }
        }




        // End coding
    }
}
