/*
    WAP to print the given star pattern taking user input
              *
             * *
            * * *
           * * * *
          * * * * *
         * * * * * *
*/

package com.HemNarayan;
import java.util.Scanner;
public class StarPattern02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        //int rows=6;
        int i , j;
        for(i=1; i<=rows; i++)
        {
            for(j=1; j<=rows-i; j++)
            {
                System.out.print(" ");
            }

            for(j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
        System.out.println(" ");
        }
        sc.close();
    }
}
