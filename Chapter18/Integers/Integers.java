import java.util.Scanner;

public class Integers
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int current;
        int sum;
        
        System.out.println("Insert the first int (0 to exit)");
        current = scan.nextInt();
        
        if(current = 0){
            System.out.println("No Integers were entered");
        } else{
            while(current != 0){
                sum = sum + current;
                System.out.println("Enter an Integer(0 to exit)");
                current = scan.nextInt;
            }
            System.out.println("Sum of the Integers: " + sum);
        }

        }
    }
}