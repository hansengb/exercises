import java.util.Scanner;

public class Pie
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int weight;

        System.out.println("Enter weight: ");
        weight = scan.nextInt();

        if (220 <= weight && weight <= 280){
            System.out.println("Allowed in contest");
        } else {
            System.out.println("Not Allowed in contest");
        }

    }
}