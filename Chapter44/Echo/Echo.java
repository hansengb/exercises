import java.util.Scanner;
public class Echo
{
    public static void main ( String[] args )
    {
        String name;
        String endName;
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = scan.nextLine();
        endName = split(name);
        System.out.print(endName);
    }

    public static String split(String name){
        name.trim();
        int n = name.indexOf(' ');
        String lastName = name.substring(n, name.length());
        lastName = lastName.toUpperCase();
        String firstName = name.substring(0, n);
        firstName = firstName.concat(lastName);
        return firstName;
    }
}