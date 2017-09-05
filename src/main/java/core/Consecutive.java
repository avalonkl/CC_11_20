package core;

import java.util.Scanner;

public class Consecutive {

    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); input.close();
        System.out.print(number + " is ");

        // Start coding
        boolean flag = true;
        int lenght = String.valueOf(number).length();
        int [] numbers = new int[lenght];

        for (int i = 0; i < lenght; i ++){
            numbers [i] = number % 10;
            number = number / 10;
        }

        for (int n = 0; n < lenght - 1; n ++) {
            if (numbers[n] < numbers[n + 1] && numbers[n + 1] - numbers[n] != 1) {
                flag = false;
                break;
            }
            else {
                if (numbers [n] > numbers [n+1] && numbers [n] - numbers [n+1] != 1){
                    flag = false;
                    break;
                }
            }
        }

        System.out.print(flag ? "consecutive" : "not consecutive");

        // End coding
    }
}
