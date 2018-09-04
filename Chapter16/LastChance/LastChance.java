import java.util.Scanner;

public class LastChance
{
    public static void main ( String[] args )
    {
        int capacity;
        int gasPercent;
        int mpg;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Capacity of the gas tank: ");
        capacity = scan.nextInt();
        System.out.println("Enter the percentage of gas left in the tank: ");
        gasPercent = scan.nextInt();
        System.out.println("Enter the miles per gallon of the car: ");
        mpg = scan.nextInt();

        if (mpg * ((gasPercent * capacity)/100) >= 200){
            System.out.println("Safe to Proceed");
        } else {

            System.out.println("Get Gas!");
        }
        

        
        
    }
}