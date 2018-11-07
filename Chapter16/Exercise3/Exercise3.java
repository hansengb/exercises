import java.util.Scanner;
import java.lang.Math;

public class Exercise3
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int n;
        double sd;
        double var;
        int counter;
        double avgSquare = 0.0;
        double avg2 = 0.0;

        System.out.println("Enter the numba of numbas: ");
        n = scan.nextInt();
        counter = n;

        while(counter > 0){
            System.out.println("Enter a number: ");
            var = scan.nextDouble();
            avg2 = avg2 + var;
            avgSquare = avgSquare + var * var;
            counter--;
        }

        avg2 = avg2/n;
        avg2 = avg2 * avg2;
        avgSquare = avgSquare/n;
        sd = Math.sqrt(avgSquare - avg2);

        System.out.println("The standar Deviation is: " + sd);


    }
}