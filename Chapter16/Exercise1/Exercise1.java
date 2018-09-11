import java.util.Scanner;

public class Exercise1
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int number;
        int helo;
        int answer = 0;

        System.out.println("How many integers will be added: ");
        number = scan.nextInt();

        while(number > 0){
            System.out.println("Enter an integer: ");
            helo = scan.nextInt();
            answer = answer + helo;
            number--;
        }

        System.out.println("ya numbas add to " + answer);



    }
}