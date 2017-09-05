package core;

import java.util.Scanner;

public class AvgPositiveNegative {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a amount of numbers:  ");
        int amount = input.nextInt(); int[] numbers = new int[amount];
        for(int i = 0; i < amount; i++) {
            System.out.println("Enter number # " + i + ": ");
            numbers[i]=input.nextInt();} input.close();
        // Start coding
        int amount_pos = 0;
        int amount_neg = 0;

        int sum_pos = 0;
        int sum_neg = 0;
        for (int i = 0; i < amount; i ++){
             if (numbers [i] < 0){
                 sum_neg += numbers [i];
                 amount_neg ++;
             }
             else {
                 sum_pos += numbers [i];
                 amount_pos ++;
             }
        }
        double avg_pos = (double) sum_pos / amount_pos;
        double avg_neg = (double) sum_neg / amount_neg;

        // End coding
        System.out.println("Positive avarage: " + avg_pos);
        System.out.println("Negative avarage: " + avg_neg);
    }
}
