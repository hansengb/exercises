import java.util.Scanner;
import java.lang.Math;

public class WindChill
{
    public static void main ( String[] args )
    {
        int speed;
        int temperature;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Wind Speed: ");
        speed = scan.nextInt();
        System.out.println("Enter Temperature: ");
        temperature = scan.nextInt();

        if (speed <= 3 || temperature >= 50){
            System.out.println("Wind CHill: " + temperature);
            
        } else {
            System.out.println("Wind Chill: " + (35.74 + (0.6215 * temperature) - 35.75*(Math.pow(speed, 0.16)) + 0.4275 * temperature*(Math.pow(speed, 0.16))));

        }


        

        
        
    }
}