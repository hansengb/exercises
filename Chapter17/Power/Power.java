import java.util.Scanner;

public class Power
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        double number = 0.0;
        double add = 0.0;
        int power;

        System.out.println("Enter the number");
        number = scan.nextDouble();
        System.out.println("Enter the power");
        power = scan.nextInt();
        add = number;
        number = 1;

        while(power > 0){
            number = number * add;
            power--;
        }

        if(power >= 0){

        System.out.println(number);

        } else if(power < 0){
            System.out.println("N must be a positive integer");
        }

    }
}