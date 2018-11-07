import java.util.Scanner;

public class JetLag
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        double hours = 0.0;
        double zones = 0.0;
        double depart = 0.0;
        double arrive = 0.0;
        double days = 0.0;

        System.out.println("Enter the number of hours of travel");
        hours = scan.nextDouble();
        System.out.println("Enter the number of time zones crossed");
        zones = scan.nextDouble();
        System.out.println("Enter when you departed(24 hour clock)");
        depart = scan.nextDouble();
        System.out.println("Enter when you arrived(24 hour clock)");
        arrive = scan.nextDouble();

        if(depart > 8 && depart <= 12){
            depart = 0;
        }else if(depart > 12 && depart <= 18){
            depart = 1;
        }else if(depart > 18 && depart <= 22){
            depart = 3;
        }else if(depart > 22 || depart <= 1){
            depart = 4;
        }else if(depart > 1 && depart <= 8){
            depart = 5;
        }

        if(arrive > 8 && arrive <= 12){
            arrive = 4;
        }else if(arrive > 12 && arrive <= 18){
            arrive = 2;
        }else if(arrive > 18 && arrive <= 22){
            arrive = 0;
        }else if(arrive > 22 || arrive <= 1){
            arrive = 1;
        }else if(arrive > 1 && arrive <= 8){
            arrive = 3;
        }

        days = ((hours/2 + (zones - 3)) + depart + arrive)/10;
        System.out.println("Days of recovery = " + days);


    }
}