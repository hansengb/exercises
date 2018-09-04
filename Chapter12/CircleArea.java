import java.util.Scanner;


public class CircleArea
{
    public static void main ( String[] args )
    {
        int inData;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input the Radius: ");
        inData = scan.nextInt();

        System.out.println("The area is: " + (Math.PI) * (inData * inData));


    }
}