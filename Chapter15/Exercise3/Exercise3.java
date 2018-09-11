import java.util.Scanner;

public class Exercise3
{
    public static void main ( String[] args )
    {
        String first;
        int firstLength;
        int secondLength;
        String second;
        int counter;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word: ");
        first = scan.nextLine();
        System.out.println("Enter second word: ");
        second = scan.nextLine();
        firstLength = first.length();
        secondLength = second.length();
        counter = 30 - firstLength - secondLength;

        System.out.print(first);
        while(counter > 0){
            System.out.print(".");
            counter--;
        }
        System.out.print(second);




        

        
    }
}