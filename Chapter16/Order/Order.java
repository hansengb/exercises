import java.util.Scanner;

public class Order
{
    public static void main ( String[] args )
    {
        int inBolts;
        int inNuts;
        int inWashers;
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the number of Bolts");
        inBolts = scan.nextInt();
        System.out.println("Input the number of Nuts");
        inNuts = scan.nextInt();
        System.out.println("Input the number of Washer");
        inWashers = scan.nextInt();
        
    }
}