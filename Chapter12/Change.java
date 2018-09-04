import java.util.Scanner;


public class Change
{
    public static void main ( String[] args )
    {
        int inData;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the change: ");
        inData = scan.nextInt();
        int dollars = (inData/100);
        int quarters = ((inData - dollars * 100)/25);
        int dimes = ((inData - (dollars * 100) - (quarters * 25))/10);
        int nickels = ((inData - (dollars * 100) - (quarters * 25) - (dimes * 10))/5);
        int cents = (inData - (dollars * 100) - (quarters * 25) - (dimes * 10) - (nickels * 5));


        System.out.println("Your change is: " + (dollars) + " dollars, " + (quarters) + " quarters, " + (dimes) + " dimes, " + (nickels) + " nickels, and " + (cents) + " pennies");

    }

}