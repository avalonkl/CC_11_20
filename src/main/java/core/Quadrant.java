package core;

import java.util.Scanner;

public class Quadrant {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an angle:  ");
        int angle = input.nextInt(); input.close();
        System.out.print("For angle of " + angle + " degrees, quadrant is: ");

        // Start coding
        int quadrant = (angle / 90) % 4 +1;

        System.out.print(quadrant);
        // End coding
    }
}
