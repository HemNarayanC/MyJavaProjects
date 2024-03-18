
import java.util.Scanner;
public class AddDistance {
    float feet;
    float inches;

    public void getDistance(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        feet = sc.nextFloat();
        System.out.print("Enter the distance in inch: ");
        inches = sc.nextFloat();
    }

    public void addDistance(AddDistance d1, AddDistance d2){
        inches = d1.inches +d2.inches;
        feet = d1.feet+d2.feet;
        System.out.println("Total feet = "+feet+" and inches= "+inches);
    }

    public static void main(String []args)
    {
        AddDistance distance1 = new AddDistance();
        AddDistance distance2 = new AddDistance();
        AddDistance sum = new AddDistance();
        System.out.println("First data: ");
        distance1.getDistance();
        System.out.println("Second data: ");
        distance2.getDistance();
        sum.addDistance(distance1, distance2);
    }
}
