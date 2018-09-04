import java.util.Scanner;

public class discount
{
    public static void main ( String[] args )
    {
        double inData;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter amount of purchases: ");
        inData = scan.nextDouble();

        if(inData >= 1000){
            inData = (inData * 0.9);
        }

        System.out.println("Discounted price: " + inData);
        
    }
}
