import java.util.Scanner;

public class Startend
{
    public static void main ( String[] args )
    {
        int startValue;
        int endValue;
        Scanner scan = new Scanner(System.in);

        System.out.println("Starting Value: ");
        startValue = scan.nextInt();
        System.out.println("Ending Value: ");
        endValue = scan.nextInt();
        System.out.println(" ");
    
        if(startValue < endValue){
            while(startValue < endValue){
                System.out.println(startValue);
                startValue = startValue + 1;
            }
        } else if(startValue > endValue){
            while(startValue > endValue){
                System.out.println(startValue);
                startValue = startValue - 1;
            }
        }
        System.out.println(startValue);
    }
}