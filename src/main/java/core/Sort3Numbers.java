package core;

import java.util.Scanner;

public class Sort3Numbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:  ");
        int a = input.nextInt();
        System.out.print("Enter second number:  ");
        int b = input.nextInt();
        System.out.print("Enter third number:  ");
        int c = input.nextInt(); input.close();
        System.out.print("Sorted numbers: ");

        // Start coding
        if (a <= b && b <= c){System.out.print(a + " " + b + " " + c);}
        if (a <= c && c <= b){System.out.print(a + " " + c + " " + b);}
        if (b <= a && a <= c){System.out.print(b + " " + a + " " + c);}
        if (b <= c && c <= a){System.out.print(b + " " + c + " " + a);}
        if (c <= b && b <= a){System.out.print(c + " " + b + " " + a);}
        if (c <= a && a <= b){System.out.print(c + " " + a + " " + b);}
        // End coding
    }
}
