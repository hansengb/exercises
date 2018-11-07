import java.util.Scanner;
public class PantryTester
{
  public static void main ( String[] args )
  {
    Scanner scan = new Scanner(System.in);
    Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
    Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
    Jam rhub  = new Jam( "Rhubarb", "10/31/99", 3 );
    int selected = -1;
    int ammount;

    Pantry hubbard = new Pantry( goose, apple, rhub );
    Pantry husband = new Pantry(rhub, rhub);
    System.out.println( husband );
    System.out.println("Welcome to Mother Hubbard's Pantry!");
    System.out.println("");

    System.out.println("The jams are: ");
    System.out.println( hubbard );
    System.out.println("Enter your selection (1, 2, or 3)");
    selected = scan.nextInt();
    if(selected <= 3){
        hubbard.select(selected);
    } else{
        while(selected > 3){
            System.out.println("Incorrect selection");
            System.out.println("Enter your selection (1, 2, or 3)");
            selected = scan.nextInt();
        }
    }

    
    

    while(selected > 0){
        System.out.println("Enter ammount to spread: ");
        ammount = scan.nextInt();
        hubbard.spread(ammount);

        System.out.println("The jams are: ");
        System.out.println( hubbard );
        System.out.println("Enter your selection (1, 2, or 3)");
        selected = scan.nextInt();
        if(selected <= 3){
            hubbard.select(selected);
        } else{
            while(selected > 3){
                System.out.println("Incorrect selection");
                System.out.println("Enter your selection (1, 2, or 3)");
                selected = scan.nextInt();
            }
        }
    }

    System.out.println("Good-by");
   
  }

  
}