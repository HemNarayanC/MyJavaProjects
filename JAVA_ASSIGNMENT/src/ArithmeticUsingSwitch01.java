
//Allow the users to input three numbers and perform addition, subtraction and multiplication

import java.util.Scanner;
public class ArithmeticUsingSwitch01 {
    static int num1, num2, num3;

    static void getOperation(){
        Scanner sc = new Scanner(System.in);
        int choice;
        choice = sc.nextInt();

        //fetch the operand
        getOperand();

        //operations that need to be performed
        switch (choice){
            case 1:
                System.out.println("Sum="+(num1+num2+num3));
                break;
            case 2:
                System.out.println("Difference="+(num1-num2-num3));
                break;
            case 3:
                System.out.println("Product="+(num1*num2*num3));
                break;
            default:
                System.out.println("Wrong Choice");
        }
        sc.close();
    }

    static void getOperand(){
        //Ask user to enter the operands
        Scanner sc = new Scanner(System.in);
        System.out.print("operand1: ");     //get first operand
        num1 = sc.nextInt();
        System.out.print("Operand2: ");     //get second operand
        num2 = sc.nextInt();
        System.out.print("Operand3: ");     //get third operand
        num3=sc.nextInt();
        sc.close();
    }


    public static void main(String[] args) {
        System.out.println("Select Operation to be performed:");
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication");      //display the options on the screen

        //calling getOperation()
        getOperation();
    }
}
