
//WAP to display the days of the week when entered number from 1 to 7 using switch statement

package com.HemNarayan;
import java.util.Scanner;

public class Seven_Days_using_Switch {
    public static void main(String[] args)
    {
        Scanner index = new Scanner(System.in);
        System.out.print("Enter the index for a Day: ");
        int day= index.nextInt();
        switch(day)
        {
            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
                System.out.println("Wednesday");
                break;

            case 5:
                System.out.println("Thursday");
                break;

            case 6:
                System.out.println("Friday");
                break;

            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Wrong Index.");
        }
        index.close();
    }
}
