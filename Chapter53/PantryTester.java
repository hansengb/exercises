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

    Jam[] jams = new Jam[4];
    jams[0] = rhub;
    jams[1] = rhub;
    jams[2] = rhub;
    jams[3] = rhub;

    Jam[] yams = new Jam[3];
    yams[0] = goose;
    yams[1] = apple;
    yams[2] = rhub;
    Pantry hubbard = new Pantry(yams);
    Pantry husband = new Pantry(jams);
    System.out.println("Welcome to Mother Husband's Pantry!");
    System.out.println("");

    System.out.println("The jams are: ");
    System.out.println( husband );
    System.out.println("Enter your selection (-1 to exit)");
    selected = scan.nextInt();
    if(selected >= 1 && selected < husband.length(selected)){
        husband.select(selected);
    } else{
        if(selected > husband.length(selected)){
            System.out.println("Incorrect selection");
            System.out.println("Enter your selection");
            selected = scan.nextInt();
        }
    }

    
    

    while(selected > 0){
        System.out.println("Enter ammount to spread: ");
        ammount = scan.nextInt();
        husband.spread(ammount);

        System.out.println("The jams are: ");
        System.out.println( husband );
        System.out.println("Enter your selection");
        selected = scan.nextInt();
        if(selected >= 1 && selected < husband.length(selected)){
            husband.select(selected);
        } else{
            if(selected > husband.length(selected)){
                System.out.println("Incorrect selection");
                System.out.println("Enter your selection");
                selected = scan.nextInt();
            }
        }
    }

    System.out.println("Good-by");
   
  }

  
}