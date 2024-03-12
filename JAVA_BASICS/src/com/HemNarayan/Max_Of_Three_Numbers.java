package com.HemNarayan;
import java.util.Scanner;

public class Max_Of_Three_Numbers {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = num.nextInt();
        System.out.print("Enter second number: ");
        int num2 = num.nextInt();
        System.out.print("Enter third number: ");
        int num3 = num.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is maximum number.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is maximum number.");
        } else {
            System.out.println(num3 + " is maximum number.");
        }
    }
}
