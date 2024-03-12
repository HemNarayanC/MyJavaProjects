
//WAP to display the days of the week when entered number from 1 to 7 using nested if

package com.HemNarayan;
import java.util.Scanner;

public class Seven_Days_Using_Nested_If {
    public static void main(String[] args)
    {
        Scanner index = new Scanner(System.in);
        System.out.print("Enter the index for a Day of the week: ");
        int num = index.nextInt();

        if(num>=1 && num<=7) {
            if (num == 1)
                System.out.println("Sunday");
            else if (num == 2)
                System.out.println("Monday");
            else if (num == 3)
                System.out.println("Tuesday");
            else if (num == 4)
                System.out.println("Wednesday");
            else if (num == 5)
                System.out.println("Thursday");
            else if (num == 6)
                System.out.println("Friday");
            else
                System.out.println("Saturday");
        }

        else {
            // Display an error message for an invalid input
            System.out.println("Invalid day number. Please enter a number between 1 and 7.");
        }
    }
}
