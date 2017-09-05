package core;

import java.util.Scanner;

public class CheckBinary {

    public static void main(String[] args) {

        System.out.print("Enter a number:  ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); sc.close();

        // Start coding
        int temp = number;
        boolean flag = true;
        while (temp > 0){
            if (temp % 10 > 1){
                flag = false;
                break;
            }
            temp /= 10;
        }
        String b = flag ? "boolean" : "not boolean";
        // End coding

        System.out.println(number + " is " + b);
    }
}
