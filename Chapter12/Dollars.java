import java.util.Scanner;


public class Dollars
{
    public static void main ( String[] args )
    {
        int inData;
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the cents: ");
        inData = scan.nextInt();

        System.out.println("That is: " + (inData/100) + " dollars and " + (inData%100) + " cents");

    }

}

