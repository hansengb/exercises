import java.util.Scanner;

public class Permutations
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        long r;
        long n;
        long counter = 0;
        double answer = 0.0;

        System.out.println("Insert the number of permutations");
        n = scan.nextLong();
        System.out.println("Insert r");
        r = scan.nextLong();

        if(n>=0 && r>=0){
            r = n - r;
            counter = n;
            counter --;
            while(counter >= 1){
                n = n * counter;
                counter--;
            }
            counter = r - 1;
            while(counter >= 1){
                r = r * counter;
                counter--;
            }

            System.out.println("The answer is " + n/r);
            
        }
    }
}